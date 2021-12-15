package com.ashraf.checkinservice.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashraf.checkinservice.dao.CheckinRepository;
import com.ashraf.checkinservice.entity.CheckinDetails;
@Service
public class CheckinServiceImpl implements CheckinService {
	
	@Autowired
	private CheckinRepository checkinRepo;
	long id;
    
	/*
	 * @Override public CheckinDetails getCheckinByPnrNo(long pnrNo) {
	 * 
	 * List<CheckinDetails> checkinDetails=checkinRepo.findAll(); for(CheckinDetails
	 * x:checkinDetails) { if(x.getPnrNo()==pnrNo) { id=x.getPnrNo(); } } return
	 * checkinRepo.findByPnrNo(id); }
	 */
	
	
	public CheckinDetails findByPnrNo(long pnrNo){
		return checkinRepo.findByPnrNo(pnrNo);
		
	}

	@Override
	public void addDetails(CheckinDetails cd) {
		checkinRepo.save(cd);
		
	}

}
