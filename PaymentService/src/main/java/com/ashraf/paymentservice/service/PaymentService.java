package com.ashraf.paymentservice.service;
import java.util.List;

import com.ashraf.paymentservice.entity.PaymentDetails;

public interface PaymentService 
{
	public List<PaymentDetails> getAll();
	public String proceedToPay(PaymentDetails payment);
	public String deletePayment(long pnrNo);
}
