package com.ashraf.searchservice.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashraf.searchservice.entity.FlightDetails;
import com.ashraf.searchservice.entity.PaymentDetails;
import com.ashraf.searchservice.repository.SearchRepository;
import com.ashraf.searchservice.repository.UserPaymentRepository;


@Service
public class SearchServiceImpl implements SearchService
{
	@Autowired
	private SearchRepository adminRepo;
	
	@Autowired
	private UserPaymentRepository userPayRepo;
	
	@Override
	public List<FlightDetails> getAllDetails() {
		List<FlightDetails> FlightDetails=new ArrayList<FlightDetails>();
		adminRepo.findAll().forEach(FlightDetails1 -> FlightDetails.add(FlightDetails1));
		return FlightDetails;
	}
	
	@Override
	public String pnrStatus(long pnrNo) {
		Random rand = new Random();
		List<String> status=new ArrayList<String>();
		status.add("Confirm");
		status.add("Waiting list");
		List<PaymentDetails> paymentList=userPayRepo.findAll();
		for(PaymentDetails det:paymentList) {
			if(det.getPnrNo()==pnrNo) {
				return status.get(rand.nextInt(status.size()));
			}
		}
		return "Ticket is not booked with PNR Number "+pnrNo;
	}
	

	public FlightDetails getDetailsByFlightNo(int flightNo) {
		return adminRepo.findByFlightNo(flightNo);
		//.orElseThrow(()->new ResourceNotFoundException("Train not found with number : "+ flightNo));
	}
	
	public List<FlightDetails> findByStartPointAndEndPointAndFlightDate(String startPoint, String endPoint,String flightDate) {
		return adminRepo.findByStartPointAndEndPointAndFlightDate(startPoint, endPoint, flightDate);
		
	}

}