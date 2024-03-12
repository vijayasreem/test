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

    public List<LoanApplication> evaluateLoanApplications(String identification, String proofOfIncome, String creditHistory, String employmentDetails) {
        return loanApplicationRepository.evaluateLoanApplications(identification, proofOfIncome, creditHistory, employmentDetails);
    }

    public Object[] getLoanDetails(long loanApplicationId) {
        return loanApplicationRepository.getLoanDetails(loanApplicationId);
    }

    public List<LoanApplication> getApprovedLoanApplications() {
        return loanApplicationRepository.getApprovedLoanApplications();
    }

    public String getLoanTermsAndConditions(long loanApplicationId) {
        return loanApplicationRepository.getLoanTermsAndConditions(loanApplicationId);
    }

    public void updateLoanApplicationStatus(long loanApplicationId, String status) {
        loanApplicationRepository.updateLoanApplicationStatus(loanApplicationId, status);
    }
}