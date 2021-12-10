package caseStudy.fareMicroservice.service;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import caseStudy.fareMicroservice.entity.FlightDetails;

public interface FareService 
{
	public List<FlightDetails> getAllDetails();
	
	
	public void addFlightDetails(FlightDetails flightDetails);
	
	public FlightDetails updateFlightDetails(int flightNo,FlightDetails flightDetails);
	
	public ResponseEntity<FlightDetails> deleteFlightDetails(int flightNo);
}
