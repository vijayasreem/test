
package com.test.repo.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String applicantId;
    private String documentType;
    private boolean verified;
    private boolean eligibilityStatus;

    // Constructors, getters, and setters

    public LoanApplication() {
    }

    public LoanApplication(String applicantId, String documentType, boolean verified, boolean eligibilityStatus) {
        this.applicantId = applicantId;
        this.documentType = documentType;
        this.verified = verified;
        this.eligibilityStatus = eligibilityStatus;
    }

    public Long getId() {
        return id;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isEligibilityStatus() {
        return eligibilityStatus;
    }

    public void setEligibilityStatus(boolean eligibilityStatus) {
        this.eligibilityStatus = eligibilityStatus;
    }
}
