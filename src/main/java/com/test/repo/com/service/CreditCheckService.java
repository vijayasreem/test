package com.test.repo.com.service;

import com.test.repo.com.model.Applicant;
import com.test.repo.com.repository.CreditCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCheckService {

    private final CreditCheckRepository creditCheckRepository;

    @Autowired
    public CreditCheckService(CreditCheckRepository creditCheckRepository) {
        this.creditCheckRepository = creditCheckRepository;
    }

    public Integer getApplicantCreditScore(Long applicantId) {
        return creditCheckRepository.getApplicantCreditScore(applicantId);
    }

    public Object[] getApplicantFinancialHistory(Long applicantId) {
        return creditCheckRepository.getApplicantFinancialHistory(applicantId);
    }

    public Object[] getApplicantCreditDetails(Long applicantId) {
        return creditCheckRepository.getApplicantCreditDetails(applicantId);
    }

    public boolean isCreditworthy(Long applicantId, Integer minCreditScore, String paymentHistory, Double maxOutstandingDebts, Double maxCreditUtilization) {
        return creditCheckRepository.isCreditworthy(applicantId, minCreditScore, paymentHistory, maxOutstandingDebts, maxCreditUtilization);
    }
}