package com.test.repo.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.repo.com.model.DocumentVerification;

@Repository
public interface DocumentVerificationRepository extends JpaRepository<DocumentVerification, Long> {
	
	DocumentVerification findByIdentityAndAddress(String identity, String address);
	
	DocumentVerification findByAnnualIncomeAndCreditScoreGreaterThanEqual(double annualIncome, int creditScore);
	
	DocumentVerification findByAnnualIncomeGreaterThanEqualAndCreditScoreGreaterThanEqual(double annualIncome, int creditScore);
	
	DocumentVerification findByAnnualIncomeGreaterThanEqualAndCreditScoreLessThan(double annualIncome, int creditScore);
	
	DocumentVerification findByAnnualIncomeLessThanAndCreditScoreGreaterThanEqual(double annualIncome, int creditScore);
	
	DocumentVerification findByAnnualIncomeLessThanAndCreditScoreLessThan(double annualIncome, int creditScore);
}