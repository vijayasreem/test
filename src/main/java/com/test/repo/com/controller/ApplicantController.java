package com.test.repo.com.controller;

import com.test.repo.com.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/applicant")
public class ApplicantController {

    private final ApplicantService applicantService;

    @Autowired
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @PostMapping("/verifyDocuments")
    @ResponseBody
    public String verifyDocuments(@RequestBody DocumentVerificationRequest request) {
        boolean identityVerified = request.isIdentityVerified();
        boolean addressVerified = request.isAddressVerified();

        applicantService.verifyDocuments(identityVerified, addressVerified);

        return "Document verification completed.";
    }

    @PostMapping("/evaluateCredit")
    @ResponseBody
    public String evaluateCredit(@RequestBody CreditEvaluationRequest request) {
        int annualIncome = request.getAnnualIncome();
        int creditScore = request.getCreditScore();

        applicantService.evaluateCredit(annualIncome, creditScore);

        return "Credit evaluation completed.";
    }

    public static class DocumentVerificationRequest {
        private boolean identityVerified;
        private boolean addressVerified;

        public boolean isIdentityVerified() {
            return identityVerified;
        }

        public void setIdentityVerified(boolean identityVerified) {
            this.identityVerified = identityVerified;
        }

        public boolean isAddressVerified() {
            return addressVerified;
        }

        public void setAddressVerified(boolean addressVerified) {
            this.addressVerified = addressVerified;
        }
    }

    public static class CreditEvaluationRequest {
        private int annualIncome;
        private int creditScore;

        public int getAnnualIncome() {
            return annualIncome;
        }

        public void setAnnualIncome(int annualIncome) {
            this.annualIncome = annualIncome;
        }

        public int getCreditScore() {
            return creditScore;
        }

        public void setCreditScore(int creditScore) {
            this.creditScore = creditScore;
        }
    }
}