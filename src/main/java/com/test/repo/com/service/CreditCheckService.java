
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

    public Integer getApplicantCreditworthinessScore(Long applicantId) {
        return creditCheckRepository.getApplicantCreditworthinessScore(applicantId);
    }

    public Boolean isApplicantCreditworthy(Long applicantId, Integer threshold) {
        return creditCheckRepository.isApplicantCreditworthy(applicantId, threshold);
    }

    public Boolean isApplicantApproved(Long applicantId, Integer threshold) {
        return creditCheckRepository.isApplicantApproved(applicantId, threshold);
    }

    public Applicant findApplicantById(Long applicantId) {
        return creditCheckRepository.findApplicantById(applicantId);
    }
}
