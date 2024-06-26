package com.test.repo.com.controller;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/channel/{channel}")
    public List<LoanApplication> getLoanApplicationsByChannel(@PathVariable String channel) {
        return loanApplicationService.getLoanApplicationsByChannel(channel);
    }

    @GetMapping("/status/{status}")
    public List<LoanApplication> getLoanApplicationsByStatus(@PathVariable String status) {
        return loanApplicationService.getLoanApplicationsByStatus(status);
    }

    @GetMapping("/customer/{customerId}")
    public List<LoanApplication> getLoanApplicationsByCustomerId(@PathVariable Long customerId) {
        return loanApplicationService.getLoanApplicationsByCustomerId(customerId);
    }

    @GetMapping("/application/{applicationId}")
    public LoanApplication getLoanApplicationByApplicationId(@PathVariable String applicationId) {
        return loanApplicationService.getLoanApplicationByApplicationId(applicationId);
    }

    @GetMapping("/real-time-updates")
    public List<LoanApplication> getApplicationsWithRealTimeUpdates() {
        return loanApplicationService.getApplicationsWithRealTimeUpdates();
    }

    @GetMapping("/additional-documentation-required")
    public List<LoanApplication> getApplicationsWithAdditionalDocumentationRequired() {
        return loanApplicationService.getApplicationsWithAdditionalDocumentationRequired();
    }

    @GetMapping("/estimated-timeline")
    public List<LoanApplication> getApplicationsWithEstimatedTimeline() {
        return loanApplicationService.getApplicationsWithEstimatedTimeline();
    }
}