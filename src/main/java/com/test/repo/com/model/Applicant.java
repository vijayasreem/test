
package com.test.repo.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String identificationVerified;
    private String incomeVerified;
    private String creditHistoryVerified;
    private String employmentDetailsVerified;
    private String verificationIssues;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificationVerified() {
        return identificationVerified;
    }

    public void setIdentificationVerified(String identificationVerified) {
        this.identificationVerified = identificationVerified;
    }

    public String getIncomeVerified() {
        return incomeVerified;
    }

    public void setIncomeVerified(String incomeVerified) {
        this.incomeVerified = incomeVerified;
    }

    public String getCreditHistoryVerified() {
        return creditHistoryVerified;
    }

    public void setCreditHistoryVerified(String creditHistoryVerified) {
        this.creditHistoryVerified = creditHistoryVerified;
    }

    public String getEmploymentDetailsVerified() {
        return employmentDetailsVerified;
    }

    public void setEmploymentDetailsVerified(String employmentDetailsVerified) {
        this.employmentDetailsVerified = employmentDetailsVerified;
    }

    public String getVerificationIssues() {
        return verificationIssues;
    }

    public void setVerificationIssues(String verificationIssues) {
        this.verificationIssues = verificationIssues;
    }
}
