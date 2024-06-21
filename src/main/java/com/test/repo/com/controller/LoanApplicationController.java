package com.test.repo.com.controller;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/customer/{customerId}")
    public List<LoanApplication> getLoanApplicationsByCustomerId(@PathVariable Long customerId) {
        return loanApplicationService.getLoanApplicationsByCustomerId(customerId);
    }

    @GetMapping("/status/{status}")
    public List<LoanApplication> getLoanApplicationsByStatus(@PathVariable String status) {
        return loanApplicationService.getLoanApplicationsByStatus(status);
    }

    @GetMapping("/channel/{channel}")
    public List<LoanApplication> getLoanApplicationsByChannel(@PathVariable String channel) {
        return loanApplicationService.getLoanApplicationsByChannel(channel);
    }

    @GetMapping("/customer/{customerId}/channel/{channel}")
    public List<LoanApplication> getLoanApplicationsByCustomerIdAndChannel(@PathVariable Long customerId, @PathVariable String channel) {
        return loanApplicationService.getLoanApplicationsByCustomerIdAndChannel(customerId, channel);
    }

    @GetMapping("/customer/{customerId}/status/{status}")
    public List<LoanApplication> getLoanApplicationsByCustomerIdAndStatus(@PathVariable Long customerId, @PathVariable String status) {
        return loanApplicationService.getLoanApplicationsByCustomerIdAndStatus(customerId, status);
    }

    @GetMapping("/channel/{channel}/status/{status}")
    public List<LoanApplication> getLoanApplicationsByChannelAndStatus(@PathVariable String channel, @PathVariable String status) {
        return loanApplicationService.getLoanApplicationsByChannelAndStatus(channel, status);
    }

    @GetMapping("/customer/{customerId}/channel/{channel}/status/{status}")
    public List<LoanApplication> getLoanApplicationsByCustomerIdAndChannelAndStatus(@PathVariable Long customerId, @PathVariable String channel, @PathVariable String status) {
        return loanApplicationService.getLoanApplicationsByCustomerIdAndChannelAndStatus(customerId, channel, status);
    }

    @GetMapping("/real-time-updates")
    public List<LoanApplication> getApplicationsWithRealTimeUpdates() {
        return loanApplicationService.getApplicationsWithRealTimeUpdates();
    }

    @GetMapping("/additional-documentation-required")
    public List<LoanApplication> getApplicationsWithAdditionalDocumentationRequired() {
        return loanApplicationService.getApplicationsWithAdditionalDocumentationRequired();
    }

    @GetMapping("/{applicationId}")
    public LoanApplication getLoanApplicationByApplicationId(@PathVariable String applicationId) {
        return loanApplicationService.getLoanApplicationByApplicationId(applicationId);
    }
}