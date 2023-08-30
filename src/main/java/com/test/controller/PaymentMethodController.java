package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.PaymentMethod;
import com.test.service.PaymentMethodService;

@RestController
public class PaymentMethodController {

	@Autowired
	private PaymentMethodService paymentMethodService;

	@GetMapping("/payment-method/{id}")
	public Optional<PaymentMethod> getPaymentMethodById(@PathVariable Long id) {
		return paymentMethodService.findById(id);
	}

	@GetMapping("/payment-methods/type/{type}")
	public List<PaymentMethod> getPaymentMethodsByType(@PathVariable String type) {
		return paymentMethodService.findAllByType(type);
	}

	@PostMapping("/payment-methods/process-credit-card")
	public void processCreditCardPayment(@RequestParam String creditCardNumber) {
		paymentMethodService.processCreditCard(creditCardNumber);
	}

	@PostMapping("/payment-methods/accept-cash")
	public void acceptCashPayment() {
		paymentMethodService.acceptCash();
	}

}