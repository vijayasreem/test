
package com.test.repo.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.repo.com.model.Applicant;
import com.test.repo.com.service.CreditCheckService;

@RestController
@RequestMapping("/credit-check")
public class CreditCheckController {

    private CreditCheckService creditCheckService;

    @Autowired
    public CreditCheckController(CreditCheckService creditCheckService) {
        this.creditCheckService = creditCheckService;
    }

    @GetMapping("/applicant/{applicantId}/credit-score")
    public Integer getApplicantCreditScore(@PathVariable Long applicantId) {
        return creditCheckService.getApplicantCreditScore(applicantId);
    }

    @GetMapping("/applicant/{applicantId}/financial-history")
    public Applicant getApplicantFinancialHistory(@PathVariable Long applicantId) {
        return creditCheckService.getApplicantFinancialHistory(applicantId);
    }

    @GetMapping("/applicant/{applicantId}/creditworthy")
    public Boolean isApplicantCreditworthy(@PathVariable Long applicantId) {
        Integer minCreditScore = 700; // Example value, replace with actual minimum credit score
        Integer paymentHistory = 12; // Example value, replace with actual payment history
        Double maxOutstandingDebts = 10000.0; // Example value, replace with actual maximum outstanding debts
        Double maxCreditUtilization = 0.5; // Example value, replace with actual maximum credit utilization
        
        return creditCheckService.isApplicantCreditworthy(applicantId, minCreditScore, paymentHistory, maxOutstandingDebts, maxCreditUtilization);
    }
}
