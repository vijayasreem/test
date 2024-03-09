package com.test.repo.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.repo.com.service.DocumentVerificationService;

@RestController
public class DocumentVerificationController {
	
	@Autowired
	private DocumentVerificationService documentVerificationService;
	
	@GetMapping("/performDocumentVerification/{identity}/{address}")
	public String performDocumentVerification(@PathVariable String identity, @PathVariable String address) {
		return documentVerificationService.performDocumentVerification(identity, address);
	}
	
	@GetMapping("/validateCreditEvaluation/{annualIncome}/{creditScore}")
	public String validateCreditEvaluation(@PathVariable double annualIncome, @PathVariable int creditScore) {
		return documentVerificationService.validateCreditEvaluation(annualIncome, creditScore);
	}
	
	@GetMapping("/closeResources")
	public void closeResources() {
		documentVerificationService.closeResources();
	}
}