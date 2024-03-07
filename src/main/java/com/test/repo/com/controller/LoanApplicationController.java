package com.test.repo.com.controller;

import com.test.repo.com.repository.LoanApplication;
import com.test.repo.com.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/applicant/{applicantId}/documentType/{documentType}")
    public ResponseEntity<List<LoanApplication>> findByApplicantIdAndDocumentType(@PathVariable String applicantId, @PathVariable String documentType) {
        List<LoanApplication> loanApplications = loanApplicationService.findByApplicantIdAndDocumentType(applicantId, documentType);
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    @GetMapping("/applicant/{applicantId}")
    public ResponseEntity<List<LoanApplication>> findByApplicantId(@PathVariable String applicantId) {
        List<LoanApplication> loanApplications = loanApplicationService.findByApplicantId(applicantId);
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    @GetMapping("/documentType/{documentType}")
    public ResponseEntity<List<LoanApplication>> findByDocumentType(@PathVariable String documentType) {
        List<LoanApplication> loanApplications = loanApplicationService.findByDocumentType(documentType);
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    @GetMapping("/applicant/{applicantId}/documentType/{documentType}/verified/{verified}")
    public ResponseEntity<List<LoanApplication>> findByApplicantIdAndDocumentTypeAndVerified(@PathVariable String applicantId, @PathVariable String documentType, @PathVariable boolean verified) {
        List<LoanApplication> loanApplications = loanApplicationService.findByApplicantIdAndDocumentTypeAndVerified(applicantId, documentType, verified);
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    @GetMapping("/eligibilityStatus/{eligibilityStatus}")
    public ResponseEntity<List<LoanApplication>> findByEligibilityStatus(@PathVariable boolean eligibilityStatus) {
        List<LoanApplication> loanApplications = loanApplicationService.findByEligibilityStatus(eligibilityStatus);
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    @GetMapping("/applicant/{applicantId}/documentType/{documentType}/count")
    public ResponseEntity<Integer> countByApplicantIdAndDocumentType(@PathVariable String applicantId, @PathVariable String documentType) {
        int count = loanApplicationService.countByApplicantIdAndDocumentType(applicantId, documentType);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/applicant/{applicantId}/documentType/{documentType}/verified/count")
    public ResponseEntity<Integer> countByApplicantIdAndDocumentTypeAndVerified(@PathVariable String applicantId, @PathVariable String documentType) {
        int count = loanApplicationService.countByApplicantIdAndDocumentTypeAndVerified(applicantId, documentType);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/applicant/{applicantId}/eligibilityStatus/count")
    public ResponseEntity<Integer> countByApplicantIdAndEligibilityStatus(@PathVariable String applicantId) {
        int count = loanApplicationService.countByApplicantIdAndEligibilityStatus(applicantId);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/eligibilityStatusTrue/count")
    public ResponseEntity<Integer> countByEligibilityStatusTrue() {
        int count = loanApplicationService.countByEligibilityStatusTrue();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/eligibilityStatusFalse/count")
    public ResponseEntity<Integer> countByEligibilityStatusFalse() {
        int count = loanApplicationService.countByEligibilityStatusFalse();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }
}