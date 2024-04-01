
package com.test.repo.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.repo.com.model.Applicant;
import com.test.repo.com.repository.CreditCheckRepository;

@Service
public class CreditCheckService {

    private CreditCheckRepository creditCheckRepository;

    @Autowired
    public CreditCheckService(CreditCheckRepository creditCheckRepository) {
        this.creditCheckRepository = creditCheckRepository;
    }

    public Integer getApplicantCreditScore(Long applicantId) {
        return creditCheckRepository.getApplicantCreditScore(applicantId);
    }

    public Applicant getApplicantFinancialHistory(Long applicantId) {
        return creditCheckRepository.getApplicantFinancialHistory(applicantId);
    }

    public Boolean isApplicantCreditworthy(Long applicantId, Integer minCreditScore, Integer paymentHistory, Double maxOutstandingDebts, Double maxCreditUtilization) {
        return creditCheckRepository.isApplicantCreditworthy(applicantId, minCreditScore, paymentHistory, maxOutstandingDebts, maxCreditUtilization);
    }
}
