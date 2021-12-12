package com.ashraf.searchservice.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ashraf.searchservice.entity.FlightDetails;

//Dao Layer
@Repository
public interface SearchRepository extends MongoRepository<FlightDetails, Integer>
{

	FlightDetails findByFlightNo(int flightNo);
	public List<FlightDetails> findByStartPointAndEndPointAndFlightDate(String startPoint, String endPoint,String flightDate);
}
