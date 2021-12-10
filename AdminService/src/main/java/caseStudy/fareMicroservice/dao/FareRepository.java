package caseStudy.fareMicroservice.dao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import caseStudy.fareMicroservice.entity.FlightDetails;


//Dao Layer
@Repository
public interface FareRepository extends MongoRepository<FlightDetails, Integer>
{
	public FlightDetails findByFlightNo(int flightNo);
}
