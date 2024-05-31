
package com.test.repo.com.repository;

import com.test.repo.com.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

    @Query("SELECT CASE WHEN a.annualIncome >= 30000 AND a.creditScore >= 700 THEN true ELSE false END FROM Applicant a WHERE a.id = :applicantId")
    boolean isEligibleForHighLimitCreditScore(Long applicantId);

    @Query("SELECT CASE WHEN a.annualIncome >= 20000 AND a.creditScore >= 600 THEN true ELSE false END FROM Applicant a WHERE a.id = :applicantId")
    boolean isEligibleForModerateLimitCreditScore(Long applicantId);
}
