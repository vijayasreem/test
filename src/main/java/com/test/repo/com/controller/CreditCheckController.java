package com.test.repo.com.controller;

import com.test.repo.com.model.Applicant;
import com.test.repo.com.service.CreditCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/applicant/{applicantId}/creditworthiness-score")
    public Integer getApplicantCreditworthinessScore(@PathVariable Long applicantId) {
        return creditCheckService.getApplicantCreditworthinessScore(applicantId);
    }

    @GetMapping("/applicant/{applicantId}/creditworthy")
    public Boolean isApplicantCreditworthy(@PathVariable Long applicantId, Integer threshold) {
        return creditCheckService.isApplicantCreditworthy(applicantId, threshold);
    }

    @GetMapping("/applicant/{applicantId}/approved")
    public Boolean isApplicantApproved(@PathVariable Long applicantId, Integer threshold) {
        return creditCheckService.isApplicantApproved(applicantId, threshold);
    }

    @GetMapping("/applicant/{applicantId}")
    public Applicant findApplicantById(@PathVariable Long applicantId) {
        return creditCheckService.findApplicantById(applicantId);
    }
}