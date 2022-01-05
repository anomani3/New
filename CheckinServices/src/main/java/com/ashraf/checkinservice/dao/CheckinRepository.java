package com.ashraf.checkinservice.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ashraf.checkinservice.entity.CheckinDetails;

@Repository
public interface CheckinRepository extends MongoRepository<CheckinDetails, Integer> {
	
	public CheckinDetails findByPnrNo(long pnrNo);
}
