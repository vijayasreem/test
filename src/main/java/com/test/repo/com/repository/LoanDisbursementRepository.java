
package com.test.repo.com.repository;

import com.test.repo.com.model.LoanDisbursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanDisbursementRepository extends JpaRepository<LoanDisbursement, Long> {

    @Query("SELECT ld FROM LoanDisbursement ld WHERE ld.bankDetails = :bankDetails")
    LoanDisbursement findByBankDetails(String bankDetails);

    @Query("SELECT ld FROM LoanDisbursement ld WHERE ld.verified = true")
    List<LoanDisbursement> findVerifiedLoanDisbursements();

    @Query("SELECT ld FROM LoanDisbursement ld WHERE ld.disbursed = true")
    List<LoanDisbursement> findDisbursedLoanDisbursements();

    // Add more custom queries as per your requirements

}
