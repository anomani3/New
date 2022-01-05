package com.ashraf.fareservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ashraf.fareservice.entity.FlightDetails;


//DAO Layer for MongoDB
@Repository
public interface FareRepository extends MongoRepository<FlightDetails, Integer>
{
	public FlightDetails findByFlightNo(int flightNo);
	public FlightDetails[] findByStartPointAndEndPointAndFlightDate(String startPoint, String endPoint,String flightDate);
}
