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
    public boolean isEligibleForHighLimitCreditScore(@PathVariable Long applicantId) {
        return applicantService.isEligibleForHighLimitCreditScore(applicantId);
    }

    @GetMapping("/{applicantId}/moderateLimitCreditScore")
    public boolean isEligibleForModerateLimitCreditScore(@PathVariable Long applicantId) {
        return applicantService.isEligibleForModerateLimitCreditScore(applicantId);
    }
}