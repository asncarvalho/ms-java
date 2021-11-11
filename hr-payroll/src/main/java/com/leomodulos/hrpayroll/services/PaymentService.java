package com.leomodulos.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.leomodulos.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long worker_Id, int days) {
		return new Payment("Ariel", 200.0, days);
	}
}
