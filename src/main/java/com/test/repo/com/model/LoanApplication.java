package com.test.repo.com.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "loan_application")
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status")
    private String status;

    @Column(name = "loan_product")
    private String loanProduct;

    @Column(name = "eligibility_criteria")
    private String eligibilityCriteria;

    @Column(name = "application_date")
    private Date applicationDate;

    @Column(name = "regulatory_changes")
    private String regulatoryChanges;

    @Column(name = "business_process_changes")
    private String businessProcessChanges;

    @Column(name = "configuration")
    private String configuration;

    @Column(name = "customization")
    private String customization;

    @Column(name = "version_control")
    private String versionControl;

    @Column(name = "documentation")
    private String documentation;

    @Column(name = "training_materials")
    private String trainingMaterials;

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

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getCustomization() {
        return customization;
    }

    public void setCustomization(String customization) {
        this.customization = customization;
    }

    public String getVersionControl() {
        return versionControl;
    }

    public void setVersionControl(String versionControl) {
        this.versionControl = versionControl;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getTrainingMaterials() {
        return trainingMaterials;
    }

    public void setTrainingMaterials(String trainingMaterials) {
        this.trainingMaterials = trainingMaterials;
    }
}