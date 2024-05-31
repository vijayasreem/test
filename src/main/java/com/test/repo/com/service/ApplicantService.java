package com.test.repo.com.service;

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

    public boolean isEligibleForHighLimitCreditScore(Long applicantId) {
        return applicantRepository.isEligibleForHighLimitCreditScore(applicantId);
    }

    public boolean isEligibleForModerateLimitCreditScore(Long applicantId) {
        return applicantRepository.isEligibleForModerateLimitCreditScore(applicantId);
    }
}