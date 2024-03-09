package com.test.repo.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.repo.com.model.User;
import com.test.repo.com.repository.UserRepository;

@Service
public class UserService {
  
    @Autowired
    private UserRepository userRepository;
  
    public String verifyDocument(String identityVerified, String addressVerified) {
        if (identityVerified.equalsIgnoreCase("yes") && addressVerified.equalsIgnoreCase("yes")) {
            return "Congratulations! You are eligible for banking services.";
        } else {
            return "Document verification is incomplete. You are not eligible for banking services.";
        }
    }
  
    public String validateCreditEvaluation(Double annualIncome, Integer creditScore) {
        if (annualIncome >= 30000 && creditScore >= 700) {
            return "Congratulations! You are eligible for a credit score with a high limit.";
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            return "You are eligible for a credit score with a moderate limit.";
        } else {
            return "You are not eligible for a credit score.";
        }
    }
  
    public String performDocumentVerificationAndCreditEvaluation(String identityVerified, String addressVerified, Double annualIncome, Integer creditScore) {
        String documentVerificationResult = verifyDocument(identityVerified, addressVerified);
        String creditEvaluationResult = validateCreditEvaluation(annualIncome, creditScore);
        return documentVerificationResult + "\n" + creditEvaluationResult;
    }
  
    public User getUserByIdentityVerifiedAndAddressVerified(Boolean identityVerified, Boolean addressVerified) {
        return userRepository.findByIdentityVerifiedAndAddressVerified(identityVerified, addressVerified);
    }
  
    public User getUserByAnnualIncomeGreaterThanEqualAndCreditScoreGreaterThanEqual(Double annualIncome, Integer creditScore) {
        return userRepository.findByAnnualIncomeGreaterThanEqualAndCreditScoreGreaterThanEqual(annualIncome, creditScore);
    }
}