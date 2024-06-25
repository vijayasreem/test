
package com.test.repo.com.repository;

import com.test.repo.com.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    @Query("SELECT la FROM LoanApplication la WHERE la.status = 'PENDING'")
    List<LoanApplication> findPendingApplications();

    @Query("SELECT la FROM LoanApplication la WHERE la.status = 'APPROVED'")
    List<LoanApplication> findApprovedApplications();

    @Query("SELECT la FROM LoanApplication la WHERE la.status = 'DISBURSED'")
    List<LoanApplication> findDisbursedApplications();

    @Query("SELECT la FROM LoanApplication la WHERE la.loanAmount <= ?1")
    List<LoanApplication> findApplicationsByLoanAmountLessThanOrEqual(double loanAmount);

    @Query("SELECT la FROM LoanApplication la WHERE la.interestRate >= ?1 AND la.interestRate <= ?2")
    List<LoanApplication> findApplicationsByInterestRateBetween(double minInterestRate, double maxInterestRate);

    @Query("SELECT la FROM LoanApplication la WHERE la.repaymentPeriod >= ?1 AND la.repaymentPeriod <= ?2")
    List<LoanApplication> findApplicationsByRepaymentPeriodBetween(int minRepaymentPeriod, int maxRepaymentPeriod);

    @Query("SELECT la FROM LoanApplication la WHERE la.status = 'APPROVED' AND la.loanAmount <= ?1 AND la.interestRate >= ?2 AND la.interestRate <= ?3 AND la.repaymentPeriod >= ?4 AND la.repaymentPeriod <= ?5")
    List<LoanApplication> findApprovedApplicationsByCriteria(double loanAmount, double minInterestRate, double maxInterestRate, int minRepaymentPeriod, int maxRepaymentPeriod);

}
