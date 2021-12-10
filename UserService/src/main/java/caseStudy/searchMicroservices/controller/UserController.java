package caseStudy.searchMicroservices.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import caseStudy.searchMicroservices.entity.FlightDetails;
import caseStudy.searchMicroservices.service.AdminServiceImpl;
import io.swagger.annotations.ApiOperation;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	private AdminServiceImpl adminServiceImpl;
	
	@GetMapping("/allflights")
	@ApiOperation(value="Get all flight details")
	public List<FlightDetails> getAllDetails()
	{
		return adminServiceImpl.getAllDetails();
	}
	
	@GetMapping("/status/{pnrNo}")
	@ApiOperation(value="Get status of your booking by Pnr Number")
	public String getStatus(@PathVariable long pnrNo)
	{
		return adminServiceImpl.pnrStatus(pnrNo);
	}
	
	@GetMapping("/flightNo/{flightNo}")
	@ApiOperation(value="Get flight details by flight Number")
	public FlightDetails getDetailsByflightNo(@PathVariable Integer flightNo) 
	{
		return adminServiceImpl.getDetailsByFlightNo(flightNo);
	}
	
	@GetMapping("/{startStation}/{destStation}")
	@ApiOperation(value="Get Flight details by giving startPoint and endPoint locations and date")
	public List<FlightDetails> getFlightDetailsByStartStation(@RequestParam String startPoint,@RequestParam  String endPoint,@RequestParam  String flightDate)
	{
		return adminServiceImpl.findByStartPointAndEndPointAndFlightDate(startPoint, endPoint, flightDate);
	}
}