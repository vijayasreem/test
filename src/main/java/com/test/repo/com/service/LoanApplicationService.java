package com.test.repo.com.service;

import com.test.repo.com.repository.LoanApplication;
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

    public List<LoanApplication> findByApplicantIdAndDocumentType(String applicantId, String documentType) {
        return loanApplicationRepository.findByApplicantIdAndDocumentType(applicantId, documentType);
    }

    public List<LoanApplication> findByApplicantId(String applicantId) {
        return loanApplicationRepository.findByApplicantId(applicantId);
    }

    public List<LoanApplication> findByDocumentType(String documentType) {
        return loanApplicationRepository.findByDocumentType(documentType);
    }

    public List<LoanApplication> findByApplicantIdAndDocumentTypeAndVerified(String applicantId, String documentType, boolean verified) {
        return loanApplicationRepository.findByApplicantIdAndDocumentTypeAndVerified(applicantId, documentType, verified);
    }

    public List<LoanApplication> findByEligibilityStatus(boolean eligibilityStatus) {
        return loanApplicationRepository.findByEligibilityStatus(eligibilityStatus);
    }

    public int countByApplicantIdAndDocumentType(String applicantId, String documentType) {
        return loanApplicationRepository.countByApplicantIdAndDocumentType(applicantId, documentType);
    }

    public int countByApplicantIdAndDocumentTypeAndVerified(String applicantId, String documentType) {
        return loanApplicationRepository.countByApplicantIdAndDocumentTypeAndVerified(applicantId, documentType);
    }

    public int countByApplicantIdAndEligibilityStatus(String applicantId) {
        return loanApplicationRepository.countByApplicantIdAndEligibilityStatus(applicantId);
    }

    public int countByEligibilityStatusTrue() {
        return loanApplicationRepository.countByEligibilityStatusTrue();
    }

    public int countByEligibilityStatusFalse() {
        return loanApplicationRepository.countByEligibilityStatusFalse();
    }
}