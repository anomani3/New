package com.ashraf.checkinservice.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ashraf.checkinservice.entity.CheckinDetails;

public interface CheckinService {
	
	//public List<CheckinDetails> getAllCheckins(); 
	
	//public CheckinDetails getCheckinByPnrNo(long pnrNo); 
	public void addDetails(CheckinDetails userDetails); 
	//public String deleteUserBookingDetails(long pnrNo); 
}
