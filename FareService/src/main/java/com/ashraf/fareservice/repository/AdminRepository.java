package com.ashraf.fareservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ashraf.fareservice.entity.AdminDetails;



@Repository
public interface AdminRepository extends MongoRepository<AdminDetails,Integer> {



}