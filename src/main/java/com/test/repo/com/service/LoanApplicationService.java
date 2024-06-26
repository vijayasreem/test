package com.test.repo.com.service;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public List<LoanApplication> getLoanApplicationsByChannel(String channel) {
        return loanApplicationRepository.findByChannel(channel);
    }

    public List<LoanApplication> getLoanApplicationsByStatus(String status) {
        return loanApplicationRepository.findByStatus(status);
    }

    public List<LoanApplication> getLoanApplicationsByCustomerId(Long customerId) {
        return loanApplicationRepository.findByCustomerId(customerId);
    }

    public LoanApplication getLoanApplicationByApplicationId(String applicationId) {
        return loanApplicationRepository.findByApplicationId(applicationId);
    }

    public List<LoanApplication> getApplicationsWithRealTimeUpdates() {
        return loanApplicationRepository.findApplicationsWithRealTimeUpdates();
    }

    public List<LoanApplication> getApplicationsWithAdditionalDocumentationRequired() {
        return loanApplicationRepository.findApplicationsWithAdditionalDocumentationRequired();
    }

    public List<LoanApplication> getApplicationsWithEstimatedTimeline() {
        return loanApplicationRepository.findApplicationsWithEstimatedTimeline();
    }
}