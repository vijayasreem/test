package com.test.repo.com.controller;

import com.test.repo.com.model.Applicant;
import com.test.repo.com.service.CreditCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/credit-check")
public class CreditCheckController {

    private final CreditCheckService creditCheckService;

    @Autowired
    public CreditCheckController(CreditCheckService creditCheckService) {
        this.creditCheckService = creditCheckService;
    }

    @GetMapping("/applicant/{applicantId}/credit-score")
    public Integer getApplicantCreditScore(@PathVariable Long applicantId) {
        return creditCheckService.getApplicantCreditScore(applicantId);
    }

    @GetMapping("/applicant/{applicantId}/financial-history")
    public Object[] getApplicantFinancialHistory(@PathVariable Long applicantId) {
        return creditCheckService.getApplicantFinancialHistory(applicantId);
    }

    @GetMapping("/applicant/{applicantId}/credit-details")
    public Object[] getApplicantCreditDetails(@PathVariable Long applicantId) {
        return creditCheckService.getApplicantCreditDetails(applicantId);
    }

    @PostMapping("/applicant/{applicantId}/creditworthiness")
    public boolean isCreditworthy(@PathVariable Long applicantId,
                                  @RequestParam Integer minCreditScore,
                                  @RequestParam String paymentHistory,
                                  @RequestParam Double maxOutstandingDebts,
                                  @RequestParam Double maxCreditUtilization) {
        return creditCheckService.isCreditworthy(applicantId, minCreditScore, paymentHistory, maxOutstandingDebts, maxCreditUtilization);
    }
}