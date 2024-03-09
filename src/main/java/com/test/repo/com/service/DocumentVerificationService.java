package com.test.repo.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.repo.com.model.DocumentVerification;
import com.test.repo.com.repository.DocumentVerificationRepository;

@Service
public class DocumentVerificationService {
	
	@Autowired
	private DocumentVerificationRepository documentVerificationRepository;
	
	public String performDocumentVerification(String identity, String address) {
		DocumentVerification documentVerification = documentVerificationRepository.findByIdentityAndAddress(identity, address);
		
		if (documentVerification != null) {
			return "Congratulations! You are eligible for banking services.";
		} else {
			return "Document verification is incomplete. You are not eligible for banking services.";
		}
	}
	
	public String validateCreditEvaluation(double annualIncome, int creditScore) {
		DocumentVerification documentVerification = documentVerificationRepository.findByAnnualIncomeAndCreditScoreGreaterThanEqual(annualIncome, creditScore);
		
		if (documentVerification != null) {
			if (annualIncome >= 30000 && creditScore >= 700) {
				return "Congratulations! You are eligible for a credit score with a high limit.";
			} else if (annualIncome >= 20000 && creditScore >= 600) {
				return "You are eligible for a credit score with a moderate limit.";
			}
		}
		
		return "You are not eligible for a credit score.";
	}
	
	public void closeResources() {
		// Close any resources here
	}
}