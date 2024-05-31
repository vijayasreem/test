package com.test.repo.com.controller;

import com.test.repo.com.model.LoanApplicant;
import com.test.repo.com.service.LoanApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loan-applicants")
public class LoanApplicantController {

    private final LoanApplicantService loanApplicantService;

    @Autowired
    public LoanApplicantController(LoanApplicantService loanApplicantService) {
        this.loanApplicantService = loanApplicantService;
    }

    @GetMapping("/credit-score/{minCreditScore}")
    public List<LoanApplicant> findByCreditScoreGreaterThanEqual(@PathVariable int minCreditScore) {
        return loanApplicantService.findByCreditScoreGreaterThanEqual(minCreditScore);
    }

    @GetMapping("/income/{minIncome}")
    public List<LoanApplicant> findByIncomeGreaterThanEqual(@PathVariable double minIncome) {
        return loanApplicantService.findByIncomeGreaterThanEqual(minIncome);
    }

    @GetMapping("/credit-score/{minCreditScore}/income/{minIncome}")
    public List<LoanApplicant> findByCreditScoreAndIncomeGreaterThanEqual(@PathVariable int minCreditScore, @PathVariable double minIncome) {
        return loanApplicantService.findByCreditScoreAndIncomeGreaterThanEqual(minCreditScore, minIncome);
    }

    @GetMapping("/credit-score/{minCreditScore}/income/{minIncome}/age/{minAge}")
    public List<LoanApplicant> findByCreditScoreAndIncomeAndAgeGreaterThanEqual(@PathVariable int minCreditScore, @PathVariable double minIncome, @PathVariable int minAge) {
        return loanApplicantService.findByCreditScoreAndIncomeAndAgeGreaterThanEqual(minCreditScore, minIncome, minAge);
    }

    // Add more API endpoints and business methods as per your requirements

}