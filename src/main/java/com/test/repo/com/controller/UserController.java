package com.test.repo.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.repo.com.model.User;
import com.test.repo.com.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
  
    @Autowired
    private UserService userService;
  
    @GetMapping("/verifyDocument/{identityVerified}/{addressVerified}")
    public String verifyDocument(@PathVariable("identityVerified") String identityVerified, @PathVariable("addressVerified") String addressVerified) {
        return userService.verifyDocument(identityVerified, addressVerified);
    }
  
    @GetMapping("/validateCreditEvaluation/{annualIncome}/{creditScore}")
    public String validateCreditEvaluation(@PathVariable("annualIncome") Double annualIncome, @PathVariable("creditScore") Integer creditScore) {
        return userService.validateCreditEvaluation(annualIncome, creditScore);
    }
  
    @GetMapping("/performVerificationAndEvaluation/{identityVerified}/{addressVerified}/{annualIncome}/{creditScore}")
    public String performDocumentVerificationAndCreditEvaluation(@PathVariable("identityVerified") String identityVerified, @PathVariable("addressVerified") String addressVerified, @PathVariable("annualIncome") Double annualIncome, @PathVariable("creditScore") Integer creditScore) {
        return userService.performDocumentVerificationAndCreditEvaluation(identityVerified, addressVerified, annualIncome, creditScore);
    }
  
    @GetMapping("/getUserByIdentityAndAddress/{identityVerified}/{addressVerified}")
    public User getUserByIdentityVerifiedAndAddressVerified(@PathVariable("identityVerified") Boolean identityVerified, @PathVariable("addressVerified") Boolean addressVerified) {
        return userService.getUserByIdentityVerifiedAndAddressVerified(identityVerified, addressVerified);
    }
  
    @GetMapping("/getUserByIncomeAndCreditScore/{annualIncome}/{creditScore}")
    public User getUserByAnnualIncomeGreaterThanEqualAndCreditScoreGreaterThanEqual(@PathVariable("annualIncome") Double annualIncome, @PathVariable("creditScore") Integer creditScore) {
        return userService.getUserByAnnualIncomeGreaterThanEqualAndCreditScoreGreaterThanEqual(annualIncome, creditScore);
    }
}