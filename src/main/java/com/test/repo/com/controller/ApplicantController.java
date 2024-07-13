package com.test.repo.com.controller;

import com.test.repo.com.model.Applicant;
import com.test.repo.com.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/applicants")
public class ApplicantController {

    private final ApplicantService applicantService;

    @Autowired
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/identification-verified")
    public List<Applicant> findAllWithIdentificationVerified() {
        return applicantService.findAllWithIdentificationVerified();
    }

    @GetMapping("/income-verified")
    public List<Applicant> findAllWithIncomeVerified() {
        return applicantService.findAllWithIncomeVerified();
    }

    @GetMapping("/credit-history-verified")
    public List<Applicant> findAllWithCreditHistoryVerified() {
        return applicantService.findAllWithCreditHistoryVerified();
    }

    @GetMapping("/employment-details-verified")
    public List<Applicant> findAllWithEmploymentDetailsVerified() {
        return applicantService.findAllWithEmploymentDetailsVerified();
    }

    @GetMapping("/verification-issues")
    public List<Applicant> findAllWithVerificationIssues() {
        return applicantService.findAllWithVerificationIssues();
    }

    // Add more endpoints for other business methods as per your requirements

}