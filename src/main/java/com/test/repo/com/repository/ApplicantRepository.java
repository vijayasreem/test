
package com.test.repo.com.repository;

import com.test.repo.com.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

    @Query("SELECT a FROM Applicant a WHERE a.identificationVerified = true")
    List<Applicant> findAllWithIdentificationVerified();

    @Query("SELECT a FROM Applicant a WHERE a.incomeVerified = true")
    List<Applicant> findAllWithIncomeVerified();

    @Query("SELECT a FROM Applicant a WHERE a.creditHistoryVerified = true")
    List<Applicant> findAllWithCreditHistoryVerified();

    @Query("SELECT a FROM Applicant a WHERE a.employmentDetailsVerified = true")
    List<Applicant> findAllWithEmploymentDetailsVerified();

    @Query("SELECT a FROM Applicant a WHERE a.verificationIssues IS NOT EMPTY")
    List<Applicant> findAllWithVerificationIssues();

    // Add more custom queries as per your requirements

}
