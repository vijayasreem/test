package com.test.repo.com.controller;

import com.test.repo.com.model.Applicant;
import com.test.repo.com.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/applicants")
public class ApplicantController {

    private final ApplicantService applicantService;

    @Autowired
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/{applicantId}/credit-score")
    public Integer getCreditScoreById(@PathVariable Long applicantId) {
        return applicantService.getCreditScoreById(applicantId);
    }

    @GetMapping("/{applicantId}/loan-amount")
    public Double getLoanAmountById(@PathVariable Long applicantId) {
        return applicantService.getLoanAmountById(applicantId);
    }

    @GetMapping("/{applicantId}/interest-rate")
    public Double getInterestRateById(@PathVariable Long applicantId) {
        return applicantService.getInterestRateById(applicantId);
    }

    @GetMapping("/{applicantId}/pre-qualified-loan-amount")
    public Double getPreQualifiedLoanAmountById(@PathVariable Long applicantId) {
        return applicantService.getPreQualifiedLoanAmountById(applicantId);
    }

    @GetMapping("/{applicantId}/min-interest-rate")
    public Double getMinInterestRateById(@PathVariable Long applicantId) {
        return applicantService.getMinInterestRateById(applicantId);
    }

    @GetMapping("/{applicantId}/max-interest-rate")
    public Double getMaxInterestRateById(@PathVariable Long applicantId) {
        return applicantService.getMaxInterestRateById(applicantId);
    }

    // Other endpoints and business methods can be added here

}