package com.test.repo.com.controller;

import com.test.repo.com.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/applicants")
public class ApplicantController {

    private final ApplicantService applicantService;

    @Autowired
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/{applicantId}/highLimitCreditScore")
    public String checkHighLimitCreditScoreEligibility(@PathVariable Long applicantId) {
        boolean isEligible = applicantService.isEligibleForHighLimitCreditScore(applicantId);
        if (isEligible) {
            return "Congratulations! You are eligible for a high limit credit score.";
        } else {
            return "Sorry, you are not eligible for a high limit credit score.";
        }
    }

    @GetMapping("/{applicantId}/moderateLimitCreditScore")
    public String checkModerateLimitCreditScoreEligibility(@PathVariable Long applicantId) {
        boolean isEligible = applicantService.isEligibleForModerateLimitCreditScore(applicantId);
        if (isEligible) {
            return "Congratulations! You are eligible for a credit score with a moderate limit.";
        } else {
            return "Sorry, you are not eligible for a credit score with a moderate limit.";
        }
    }
}