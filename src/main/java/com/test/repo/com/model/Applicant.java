
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
    private Integer creditScore;
    private String paymentHistory;
    private Double outstandingDebts;
    private Double creditUtilization;

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
}
