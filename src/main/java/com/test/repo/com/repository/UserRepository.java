package com.test.repo.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.repo.com.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  
    User findByIdentityVerifiedAndAddressVerified(Boolean identityVerified, Boolean addressVerified);
  
    User findByAnnualIncomeGreaterThanEqualAndCreditScoreGreaterThanEqual(Double annualIncome, Integer creditScore);
  
}