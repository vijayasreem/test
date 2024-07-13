package com.test.repo.com.controller;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/approved")
    public List<LoanApplication> getApprovedApplications() {
        return loanApplicationService.findApprovedApplications();
    }

    @GetMapping("/approved-document-verification")
    public List<LoanApplication> getApplicationsWithApprovedDocumentVerification() {
        return loanApplicationService.findApplicationsWithApprovedDocumentVerification();
    }

    // Add more endpoints for other business methods as needed

}