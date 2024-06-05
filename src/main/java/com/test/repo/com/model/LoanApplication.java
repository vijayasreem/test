
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

    private String status;
    private String loanProduct;
    private String eligibilityCriteria;
    private Date applicationDate;
    private String regulatoryChanges;
    private String businessProcessChanges;
    private int version;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLoanProduct() {
        return loanProduct;
    }

    public void setLoanProduct(String loanProduct) {
        this.loanProduct = loanProduct;
    }

    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    public void setEligibilityCriteria(String eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getRegulatoryChanges() {
        return regulatoryChanges;
    }

    public void setRegulatoryChanges(String regulatoryChanges) {
        this.regulatoryChanges = regulatoryChanges;
    }

    public String getBusinessProcessChanges() {
        return businessProcessChanges;
    }

    public void setBusinessProcessChanges(String businessProcessChanges) {
        this.businessProcessChanges = businessProcessChanges;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
