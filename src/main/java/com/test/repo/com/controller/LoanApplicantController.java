package com.test.repo.com.controller;

import com.test.repo.com.model.LoanApplicant;
import com.test.repo.com.service.LoanApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanApplicantController {

    private final LoanApplicantService loanApplicantService;

    @Autowired
    public LoanApplicantController(LoanApplicantService loanApplicantService) {
        this.loanApplicantService = loanApplicantService;
    }

    @GetMapping("/applicants/credit-score")
    public List<LoanApplicant> findByCreditScoreGreaterThanEqual(@RequestParam int minCreditScore) {
        return loanApplicantService.findByCreditScoreGreaterThanEqual(minCreditScore);
    }

    @GetMapping("/applicants/income")
    public List<LoanApplicant> findByIncomeGreaterThanEqual(@RequestParam double minIncome) {
        return loanApplicantService.findByIncomeGreaterThanEqual(minIncome);
    }

    @GetMapping("/applicants/credit-score-and-income")
    public List<LoanApplicant> findByCreditScoreAndIncomeGreaterThanEqual(@RequestParam int minCreditScore, @RequestParam double minIncome) {
        return loanApplicantService.findByCreditScoreAndIncomeGreaterThanEqual(minCreditScore, minIncome);
    }

    // Add more endpoints and business methods as per your requirements

}