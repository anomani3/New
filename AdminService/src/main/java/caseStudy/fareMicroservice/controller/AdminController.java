package caseStudy.fareMicroservice.controller;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import caseStudy.fareMicroservice.dao.FareRepository;
import caseStudy.fareMicroservice.entity.FlightDetails;
import caseStudy.fareMicroservice.service.FareServiceImpl;
import io.swagger.annotations.ApiOperation;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/admin")
public class AdminController 
{
	@Autowired
	private FareServiceImpl fareServiceImpl;
	
	@Autowired
	private FareRepository repo;
	

	@GetMapping("/all")
	@ApiOperation(value="Get all Flight details")
	public List<FlightDetails> getAllDetails()
	{
		return fareServiceImpl.getAllDetails();
	}
	

	@GetMapping("/{flightNo}")
	@ApiOperation(value="Get all Flight details by flight Number")
	public FlightDetails getDetailsByFlightNo(@PathVariable Integer flightNo) 
	{
		return repo.findByFlightNo(flightNo);
	}
	

	@PostMapping("/add")
	@ApiOperation(value="Add new Flight details to flight database")
	public String addFlightDetails(@Valid @RequestBody FlightDetails flightDetails)
	{
		fareServiceImpl.addFlightDetails(flightDetails);
		return ("Added train details with train number - "+flightDetails.getFlightNo()+" successfully..!!");
	}
	

	@PutMapping("/update/{flightNo}")
	@ApiOperation(value="Update flight details in flight database by flight Number")
	public FlightDetails updateFlightDetails(@PathVariable Integer flightNo,@Valid @RequestBody FlightDetails flightDetails)
	{
		return fareServiceImpl.updateFlightDetails(flightNo,flightDetails);
	}
	

	@DeleteMapping("/delete/{flightNo}")
	@ApiOperation(value="Delete flight details in train database by Train Number")
	public ResponseEntity<FlightDetails> deleteFlightDetails(@PathVariable Integer flightNo)
	{
		return fareServiceImpl.deleteFlightDetails(flightNo);
	}
	
	//update the no of seats based on the no of passengers that booked ticket
	@GetMapping("/updateSeats/{flightNo}/{noOfPassengers}")
	public void updateSeats(@PathVariable int flightNo,@PathVariable int noOfPassengers)
	{
		FlightDetails currentflight=repo.findByFlightNo(flightNo);
		int initialSeats=currentflight.getNoOfSeats();
		int finalSeats=initialSeats-noOfPassengers;
		currentflight.setNoOfSeats(finalSeats);
		fareServiceImpl.updateFlightDetails(flightNo, currentflight);
	}
}