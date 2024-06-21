
package com.test.repo.com.repository;

import com.test.repo.com.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    // Query to retrieve loan applications by customer ID
    List<LoanApplication> findByCustomerId(Long customerId);

    // Query to retrieve loan applications by application status
    List<LoanApplication> findByStatus(String status);

    // Query to retrieve loan applications by channel (in-person, website, mobile app)
    List<LoanApplication> findByChannel(String channel);

    // Query to retrieve loan applications by customer ID and channel
    List<LoanApplication> findByCustomerIdAndChannel(Long customerId, String channel);

    // Query to retrieve loan applications by customer ID and status
    List<LoanApplication> findByCustomerIdAndStatus(Long customerId, String status);

    // Query to retrieve loan applications by channel and status
    List<LoanApplication> findByChannelAndStatus(String channel, String status);

    // Query to retrieve loan applications by customer ID, channel, and status
    List<LoanApplication> findByCustomerIdAndChannelAndStatus(Long customerId, String channel, String status);

    // Query to retrieve loan applications with real-time updates
    @Query("SELECT la FROM LoanApplication la WHERE la.status <> 'COMPLETED'")
    List<LoanApplication> findApplicationsWithRealTimeUpdates();

    // Query to retrieve loan applications with additional documentation required
    @Query("SELECT la FROM LoanApplication la WHERE la.additionalDocumentationRequired = true")
    List<LoanApplication> findApplicationsWithAdditionalDocumentationRequired();

    // Query to retrieve loan applications with a specific application ID
    LoanApplication findByApplicationId(String applicationId);
}
