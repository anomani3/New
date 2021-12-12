package com.ashraf.paymentservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ashraf.paymentservice.entity.PaymentDetails;

@Repository
public interface UserPaymentRepository extends MongoRepository<PaymentDetails, Long>
{

}
