
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

    @Query("SELECT a.creditworthinessScore FROM Applicant a WHERE a.id = :applicantId")
    Integer getApplicantCreditworthinessScore(Long applicantId);

    @Query("SELECT a.creditworthinessScore >= :threshold FROM Applicant a WHERE a.id = :applicantId")
    Boolean isApplicantCreditworthy(Long applicantId, Integer threshold);

    @Query("SELECT a.creditworthinessScore >= :threshold FROM Applicant a WHERE a.id = :applicantId")
    Boolean isApplicantApproved(Long applicantId, Integer threshold);

    @Query("SELECT a FROM Applicant a WHERE a.id = :applicantId")
    Applicant findApplicantById(Long applicantId);
}
