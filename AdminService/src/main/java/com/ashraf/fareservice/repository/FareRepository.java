package com.ashraf.fareservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ashraf.fareservice.entity.FlightDetails;


//Dao Layer
@Repository
public interface FareRepository extends MongoRepository<FlightDetails, Integer>
{
	public FlightDetails findByFlightNo(int flightNo);
}
