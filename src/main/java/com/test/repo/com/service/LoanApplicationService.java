package com.test.repo.com.service;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public List<LoanApplication> getLoanApplicationsByStatus(String status) {
        return loanApplicationRepository.findByStatus(status);
    }

    public List<LoanApplication> getLoanApplicationsByLoanProduct(String loanProduct) {
        return loanApplicationRepository.findByLoanProduct(loanProduct);
    }

    public List<LoanApplication> getLoanApplicationsByEligibilityCriteria(String eligibilityCriteria) {
        return loanApplicationRepository.findByEligibilityCriteria(eligibilityCriteria);
    }

    public List<LoanApplication> getLoanApplicationsByApplicationDateRange(Date startDate, Date endDate) {
        return loanApplicationRepository.findByApplicationDateRange(startDate, endDate);
    }

    public List<LoanApplication> getLoanApplicationsByRegulatoryChanges(String regulatoryChanges) {
        return loanApplicationRepository.findByRegulatoryChanges(regulatoryChanges);
    }

    public List<LoanApplication> getLoanApplicationsByBusinessProcessChanges(String businessProcessChanges) {
        return loanApplicationRepository.findByBusinessProcessChanges(businessProcessChanges);
    }

    public List<LoanApplication> getLoanApplicationsByVersion(int version) {
        return loanApplicationRepository.findByVersion(version);
    }
}