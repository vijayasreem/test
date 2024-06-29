
package com.test.repo.com.repository;

import com.test.repo.com.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCheckRepository extends JpaRepository<Applicant, Long> {

    @Query("SELECT a.creditScore FROM Applicant a WHERE a.id = :applicantId")
    Integer getApplicantCreditScore(Long applicantId);

    @Query("SELECT a.paymentHistory, a.outstandingDebts, a.creditUtilization FROM Applicant a WHERE a.id = :applicantId")
    Object[] getApplicantFinancialHistory(Long applicantId);

    @Query("SELECT a.creditScore, a.paymentHistory, a.outstandingDebts, a.creditUtilization FROM Applicant a WHERE a.id = :applicantId")
    Object[] getApplicantCreditDetails(Long applicantId);

    @Query("SELECT CASE WHEN (a.creditScore >= :minCreditScore AND a.paymentHistory = :paymentHistory AND a.outstandingDebts <= :maxOutstandingDebts AND a.creditUtilization <= :maxCreditUtilization) THEN true ELSE false END FROM Applicant a WHERE a.id = :applicantId")
    boolean isCreditworthy(Long applicantId, Integer minCreditScore, String paymentHistory, Double maxOutstandingDebts, Double maxCreditUtilization);
}
