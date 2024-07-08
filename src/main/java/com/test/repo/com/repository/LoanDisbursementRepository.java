
package com.test.repo.com.repository;

import com.test.repo.com.model.LoanDisbursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LoanDisbursementRepository extends JpaRepository<LoanDisbursement, Long> {

    List<LoanDisbursement> findByRecipientName(String recipientName);

    List<LoanDisbursement> findByLoanAmountGreaterThan(double loanAmount);

    List<LoanDisbursement> findByDisbursementDateBetween(Date startDate, Date endDate);

    List<LoanDisbursement> findByDisbursementStatus(String disbursementStatus);

    List<LoanDisbursement> findByRecipientNameAndDisbursementStatus(String recipientName, String disbursementStatus);

    // Add any additional custom queries or methods as per your requirements

}
