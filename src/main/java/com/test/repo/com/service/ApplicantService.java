package com.test.repo.com.service;

import com.test.repo.com.model.Applicant;
import com.test.repo.com.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {

    private final ApplicantRepository applicantRepository;

    @Autowired
    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public List<Applicant> findAllWithIdentificationVerified() {
        return applicantRepository.findAllWithIdentificationVerified();
    }

    public List<Applicant> findAllWithIncomeVerified() {
        return applicantRepository.findAllWithIncomeVerified();
    }

    public List<Applicant> findAllWithCreditHistoryVerified() {
        return applicantRepository.findAllWithCreditHistoryVerified();
    }

    public List<Applicant> findAllWithEmploymentDetailsVerified() {
        return applicantRepository.findAllWithEmploymentDetailsVerified();
    }

    public List<Applicant> findAllWithVerificationIssues() {
        return applicantRepository.findAllWithVerificationIssues();
    }

    // Add more business methods as per your requirements

}