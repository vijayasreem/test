
package com.test.repo.com.repository;

import com.test.repo.com.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    @Query("SELECT l FROM LoanApplication l WHERE l.creditCheckStatus = 'APPROVED'")
    List<LoanApplication> findApprovedApplications();

    @Query("SELECT l FROM LoanApplication l WHERE l.documentVerificationStatus = 'APPROVED'")
    List<LoanApplication> findApplicationsWithApprovedDocumentVerification();

    // Add more custom queries as needed

}
