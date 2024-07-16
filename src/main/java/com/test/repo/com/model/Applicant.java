
package com.test.repo.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "credit_score")
    private Integer creditScore;

    @Column(name = "payment_history")
    private String paymentHistory;

    @Column(name = "outstanding_debts")
    private Double outstandingDebts;

    @Column(name = "credit_utilization")
    private Double creditUtilization;

    @Column(name = "creditworthiness_score")
    private Integer creditworthinessScore;

    @Column(name = "approved")
    private Boolean approved;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public String getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(String paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public Double getOutstandingDebts() {
        return outstandingDebts;
    }

    public void setOutstandingDebts(Double outstandingDebts) {
        this.outstandingDebts = outstandingDebts;
    }

    public Double getCreditUtilization() {
        return creditUtilization;
    }

    public void setCreditUtilization(Double creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    public Integer getCreditworthinessScore() {
        return creditworthinessScore;
    }

    public void setCreditworthinessScore(Integer creditworthinessScore) {
        this.creditworthinessScore = creditworthinessScore;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }
}
