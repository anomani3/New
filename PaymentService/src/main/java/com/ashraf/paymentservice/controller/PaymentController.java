package com.ashraf.paymentservice.controller;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ashraf.paymentservice.entity.PaymentDetails;
import com.ashraf.paymentservice.repository.UserPaymentRepository;
import com.ashraf.paymentservice.service.PaymentServiceImpl;

import io.swagger.annotations.ApiOperation;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/pay")
public class PaymentController 
{
	@Autowired
	PaymentServiceImpl paySerImpl;
	

	@GetMapping("/all")
	@ApiOperation(value="Get all users who completed payment")
	public List<PaymentDetails> getAll()
	{
		return paySerImpl.getAll();
	}
	
	 @PostMapping("/add") 
	 @ApiOperation(value="Inorder to proceed to payment")
	 public String addPaymentDetails(@Valid @RequestBody PaymentDetails payment) 
	 { 
		long pnrNo=payment.getPnrNo();
		paySerImpl.proceedToPay(payment); 
		paySerImpl.updateUserPaymentDetails(payment.getPnrNo());
		String sentMsg="Your payment is successful";
		return sentMsg;  
	 }
	 
//	 @DeleteMapping("/cancel/{pnrNo}")
//	 @ApiOperation(value="Inorder to cancel your payment")
//	 public String deletePaymentDetails(@PathVariable long pnrNo)
//	 {
//		  paySerImpl.deletePayment(pnrNo);
//		  return "Cancelled Sucessfully";
//	 }
	
	 @RequestMapping(value = "/cancel/{pnrNo}", method = { RequestMethod.GET, RequestMethod.DELETE })
	 @ApiOperation(value = "Inorder to cancel your payment")
	 public String deletePaymentDetails(@PathVariable long pnrNo) {
	 return paySerImpl.deletePayment(pnrNo);
	 }

	 



}