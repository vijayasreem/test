
package com.test.repo.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.repo.com.model.Applicant;

@Repository
public interface CreditCheckRepository extends JpaRepository<Applicant, Long> {

    @Query("SELECT creditScore FROM Applicant WHERE id = :applicantId")
    Integer getApplicantCreditScore(Long applicantId);

    @Query("SELECT paymentHistory, outstandingDebts, creditUtilization FROM Applicant WHERE id = :applicantId")
    Applicant getApplicantFinancialHistory(Long applicantId);

    @Query("SELECT CASE WHEN (creditScore >= :minCreditScore AND paymentHistory = :paymentHistory AND outstandingDebts <= :maxOutstandingDebts AND creditUtilization <= :maxCreditUtilization) THEN true ELSE false END FROM Applicant WHERE id = :applicantId")
    Boolean isApplicantCreditworthy(Long applicantId, Integer minCreditScore, Integer paymentHistory, Double maxOutstandingDebts, Double maxCreditUtilization);
}
