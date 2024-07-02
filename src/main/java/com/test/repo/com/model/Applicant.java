
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
    private Double loanAmount;
    private Double interestRate;
    private Double preQualifiedLoanAmount;
    private Double minInterestRate;
    private Double maxInterestRate;

    // Getters and setters

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

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getPreQualifiedLoanAmount() {
        return preQualifiedLoanAmount;
    }

    public void setPreQualifiedLoanAmount(Double preQualifiedLoanAmount) {
        this.preQualifiedLoanAmount = preQualifiedLoanAmount;
    }

    public Double getMinInterestRate() {
        return minInterestRate;
    }

    public void setMinInterestRate(Double minInterestRate) {
        this.minInterestRate = minInterestRate;
    }

    public Double getMaxInterestRate() {
        return maxInterestRate;
    }

    public void setMaxInterestRate(Double maxInterestRate) {
        this.maxInterestRate = maxInterestRate;
    }
}
