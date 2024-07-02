
package com.test.repo.com.repository;

import com.test.repo.com.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

    @Query("SELECT a.creditScore FROM Applicant a WHERE a.id = :applicantId")
    Integer getCreditScoreById(Long applicantId);

    @Query("SELECT a.loanAmount FROM Applicant a WHERE a.id = :applicantId")
    Double getLoanAmountById(Long applicantId);

    @Query("SELECT a.interestRate FROM Applicant a WHERE a.id = :applicantId")
    Double getInterestRateById(Long applicantId);

    @Query("SELECT a.preQualifiedLoanAmount FROM Applicant a WHERE a.id = :applicantId")
    Double getPreQualifiedLoanAmountById(Long applicantId);

    @Query("SELECT a.minInterestRate FROM Applicant a WHERE a.id = :applicantId")
    Double getMinInterestRateById(Long applicantId);

    @Query("SELECT a.maxInterestRate FROM Applicant a WHERE a.id = :applicantId")
    Double getMaxInterestRateById(Long applicantId);

    // Other custom queries and methods can be added here

}
