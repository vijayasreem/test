
package com.test.repo.com.repository;

import com.test.repo.com.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    // Query to retrieve loan applications by status
    List<LoanApplication> findByStatus(String status);

    // Query to retrieve loan applications by loan product
    List<LoanApplication> findByLoanProduct(String loanProduct);

    // Query to retrieve loan applications by eligibility criteria
    @Query("SELECT la FROM LoanApplication la WHERE la.eligibilityCriteria = ?1")
    List<LoanApplication> findByEligibilityCriteria(String eligibilityCriteria);

    // Query to retrieve loan applications by date range
    @Query("SELECT la FROM LoanApplication la WHERE la.applicationDate BETWEEN ?1 AND ?2")
    List<LoanApplication> findByApplicationDateRange(Date startDate, Date endDate);

    // Query to retrieve loan applications by regulatory changes
    @Query("SELECT la FROM LoanApplication la WHERE la.regulatoryChanges = ?1")
    List<LoanApplication> findByRegulatoryChanges(String regulatoryChanges);

    // Query to retrieve loan applications by business process changes
    @Query("SELECT la FROM LoanApplication la WHERE la.businessProcessChanges = ?1")
    List<LoanApplication> findByBusinessProcessChanges(String businessProcessChanges);

    // Query to retrieve loan applications by version
    @Query("SELECT la FROM LoanApplication la WHERE la.version = ?1")
    List<LoanApplication> findByVersion(int version);
}
