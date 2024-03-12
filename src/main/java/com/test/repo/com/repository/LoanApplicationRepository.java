
package com.test.repo.com.repository;

import com.test.repo.com.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    // Query to evaluate loan applications based on provided information
    @Query("SELECT la FROM LoanApplication la WHERE la.identification = ?1 AND la.proofOfIncome = ?2 AND la.creditHistory = ?3 AND la.employmentDetails = ?4")
    List<LoanApplication> evaluateLoanApplications(String identification, String proofOfIncome, String creditHistory, String employmentDetails);

    // Query to determine loan amount, interest rate, and repayment period
    @Query("SELECT la.loanAmount, la.interestRate, la.repaymentPeriod FROM LoanApplication la WHERE la.id = ?1")
    Object[] getLoanDetails(long loanApplicationId);

    // Query to retrieve approved loan applications
    @Query("SELECT la FROM LoanApplication la WHERE la.status = 'APPROVED'")
    List<LoanApplication> getApprovedLoanApplications();

    // Query to retrieve loan terms and conditions
    @Query("SELECT la.termsAndConditions FROM LoanApplication la WHERE la.id = ?1")
    String getLoanTermsAndConditions(long loanApplicationId);

    // Query to update loan application status
    @Query("UPDATE LoanApplication la SET la.status = ?2 WHERE la.id = ?1")
    void updateLoanApplicationStatus(long loanApplicationId, String status);

}
