
package com.test.repo.com.repository;

import com.test.repo.com.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    // Query to get loan applications by channel
    @Query("SELECT la FROM LoanApplication la WHERE la.channel = ?1")
    List<LoanApplication> findByChannel(String channel);

    // Query to get loan applications by status
    @Query("SELECT la FROM LoanApplication la WHERE la.status = ?1")
    List<LoanApplication> findByStatus(String status);

    // Query to get loan applications by customer ID
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1")
    List<LoanApplication> findByCustomerId(Long customerId);

    // Query to get loan applications by application ID
    @Query("SELECT la FROM LoanApplication la WHERE la.applicationId = ?1")
    LoanApplication findByApplicationId(String applicationId);

    // Query to get loan applications with real-time updates
    @Query("SELECT la FROM LoanApplication la WHERE la.status <> 'Completed'")
    List<LoanApplication> findApplicationsWithRealTimeUpdates();

    // Query to get loan applications with additional documentation required
    @Query("SELECT la FROM LoanApplication la WHERE la.additionalDocumentationRequired = true")
    List<LoanApplication> findApplicationsWithAdditionalDocumentationRequired();

    // Query to get loan applications with estimated timeline
    @Query("SELECT la FROM LoanApplication la WHERE la.estimatedTimeline IS NOT NULL")
    List<LoanApplication> findApplicationsWithEstimatedTimeline();
}
