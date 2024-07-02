package com.test.repo.com.service;

import com.test.repo.com.model.Applicant;
import com.test.repo.com.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {

    private final ApplicantRepository applicantRepository;

    @Autowired
    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public Integer getCreditScoreById(Long applicantId) {
        return applicantRepository.getCreditScoreById(applicantId);
    }

    public Double getLoanAmountById(Long applicantId) {
        return applicantRepository.getLoanAmountById(applicantId);
    }

    public Double getInterestRateById(Long applicantId) {
        return applicantRepository.getInterestRateById(applicantId);
    }

    public Double getPreQualifiedLoanAmountById(Long applicantId) {
        return applicantRepository.getPreQualifiedLoanAmountById(applicantId);
    }

    public Double getMinInterestRateById(Long applicantId) {
        return applicantRepository.getMinInterestRateById(applicantId);
    }

    public Double getMaxInterestRateById(Long applicantId) {
        return applicantRepository.getMaxInterestRateById(applicantId);
    }

    // Other business methods and logic can be added here

}