package com.test.repo.com.controller;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan-application")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @PostMapping("/evaluate")
    public List<LoanApplication> evaluateLoanApplications(@RequestParam String identification,
                                                          @RequestParam String proofOfIncome,
                                                          @RequestParam String creditHistory,
                                                          @RequestParam String employmentDetails) {
        return loanApplicationService.evaluateLoanApplications(identification, proofOfIncome, creditHistory, employmentDetails);
    }

    @GetMapping("/{loanApplicationId}/details")
    public Object[] getLoanDetails(@PathVariable long loanApplicationId) {
        return loanApplicationService.getLoanDetails(loanApplicationId);
    }

    @GetMapping("/approved")
    public List<LoanApplication> getApprovedLoanApplications() {
        return loanApplicationService.getApprovedLoanApplications();
    }

    @GetMapping("/{loanApplicationId}/terms")
    public String getLoanTermsAndConditions(@PathVariable long loanApplicationId) {
        return loanApplicationService.getLoanTermsAndConditions(loanApplicationId);
    }

    @PutMapping("/{loanApplicationId}/status")
    public void updateLoanApplicationStatus(@PathVariable long loanApplicationId, @RequestParam String status) {
        loanApplicationService.updateLoanApplicationStatus(loanApplicationId, status);
    }
}