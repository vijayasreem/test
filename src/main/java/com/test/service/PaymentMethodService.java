package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.PaymentMethod;
import com.test.repository.PaymentMethodRepository;

@Service
public class PaymentMethodService {

	@Autowired
    private PaymentMethodRepository paymentMethodRepository;
	
	public Optional<PaymentMethod> findById(Long id) {
	    return paymentMethodRepository.findById(id);
	}

	public List<PaymentMethod> findAllByType(String type) {
	    return paymentMethodRepository.findAllByType(type);
	}

	public List<PaymentMethod> findAllByNotification(String notification) {
	    return paymentMethodRepository.findAllByNotification(notification);
	}
	
	public void processCreditCard(String creditCardNumber) {
		// Process credit card payment here
		// ...
		
		// After credit card is processed, send notification
		String notification = "Payment successful. Your credit card number is: " + creditCardNumber;
		paymentMethodRepository.findAllByNotification(notification);
	}
	
	public void acceptCash() {
		// Accept cash payment here
		// ...
		
		// After cash is accepted, send notification
		String notification = "Payment successful. Thank you for paying with cash.";
		paymentMethodRepository.findAllByNotification(notification);
	}

}