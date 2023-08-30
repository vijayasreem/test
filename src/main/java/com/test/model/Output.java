package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Output {
 
    @Id
    private Long id;
    private String endorsementNumber;
    private String policyNumber;
    private String clientName;
    private String productName;
    private String productType;
    private String productCode;
    private String startDate;
    private String endDate;
    private String status;
 
    public Output() {
    }
 
    public Output(Long id, String endorsementNumber, String policyNumber, String clientName, String productName, String productType, String productCode, String startDate, String endDate, String status) {
        this.id = id;
        this.endorsementNumber = endorsementNumber;
        this.policyNumber = policyNumber;
        this.clientName = clientName;
        this.productName = productName;
        this.productType = productType;
        this.productCode = productCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getEndorsementNumber() {
        return endorsementNumber;
    }
 
    public void setEndorsementNumber(String endorsementNumber) {
        this.endorsementNumber = endorsementNumber;
    }
 
    public String getPolicyNumber() {
        return policyNumber;
    }
 
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
 
    public String getClientName() {
        return clientName;
    }
 
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
 
    public String getProductName() {
        return productName;
    }
 
    public void setProductName(String productName) {
        this.productName = productName;
    }
 
    public String getProductType() {
        return productType;
    }
 
    public void setProductType(String productType) {
        this.productType = productType;
    }
 
    public String getProductCode() {
        return productCode;
    }
 
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
 
    public String getStartDate() {
        return startDate;
    }
 
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
 
    public String getEndDate() {
        return endDate;
    }
 
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        this.status = status;
    }

}