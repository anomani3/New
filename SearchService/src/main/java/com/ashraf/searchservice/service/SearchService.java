package com.ashraf.searchservice.service;
import java.util.List;

import com.ashraf.searchservice.entity.FlightDetails;

public interface SearchService 
{
	public List<FlightDetails> getAllDetails();
	public String pnrStatus(long pnrNo);
	public FlightDetails getDetailsByFlightNo(int flightNo);
	public List<FlightDetails> findByStartPointAndEndPointAndFlightDate(String startPoint, String endPoint,
			String flightDate);
}
