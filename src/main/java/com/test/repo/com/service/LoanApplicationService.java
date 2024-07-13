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

    public List<LoanApplication> findApprovedApplications() {
        return loanApplicationRepository.findApprovedApplications();
    }

    public List<LoanApplication> findApplicationsWithApprovedDocumentVerification() {
        return loanApplicationRepository.findApplicationsWithApprovedDocumentVerification();
    }

    // Add more business methods as needed

}