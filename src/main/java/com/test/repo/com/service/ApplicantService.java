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

    public void verifyDocuments(boolean identityVerified, boolean addressVerified) {
        if (identityVerified && addressVerified) {
            System.out.println("Congratulations! You are eligible for banking services.");
        } else {
            System.out.println("Document verification is incomplete. You are not eligible for banking services.");
        }
    }

    public void evaluateCredit(int annualIncome, int creditScore) {
        if (annualIncome >= 30000 && creditScore >= 700) {
            System.out.println("Congratulations! You are eligible for a credit score with a high limit.");
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            System.out.println("You are eligible for a credit score with a moderate limit.");
        } else {
            System.out.println("You are not eligible for a credit score.");
        }
    }

    public boolean isEligibleForBankingServices() {
        return applicantRepository.isEligibleForBankingServices();
    }

    public boolean isEligibleForHighCreditScore() {
        return applicantRepository.isEligibleForHighCreditScore();
    }

    public boolean isEligibleForModerateCreditScore() {
        return applicantRepository.isEligibleForModerateCreditScore();
    }
}