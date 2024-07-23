
package com.test.repo.com.repository;

import com.test.repo.com.model.CarMortgageLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarMortgageLoanRepository extends JpaRepository<CarMortgageLoan, Long> {

    // Custom queries for car mortgage loan applications

    @Query("SELECT cml FROM CarMortgageLoan cml WHERE cml.customerId = :customerId")
    CarMortgageLoan findByCustomerId(Long customerId);

    @Query("SELECT cml FROM CarMortgageLoan cml WHERE cml.status = :status")
    List<CarMortgageLoan> findByStatus(String status);

    @Query("SELECT cml FROM CarMortgageLoan cml WHERE cml.loanAmount <= :loanAmount")
    List<CarMortgageLoan> findByLoanAmountLessThanEqual(Double loanAmount);

    // Other required methods

    List<CarMortgageLoan> findByCustomerName(String customerName);

    List<CarMortgageLoan> findByContactNumber(String contactNumber);

    List<CarMortgageLoan> findByEmploymentDetails(String employmentDetails);

    List<CarMortgageLoan> findByLoanRequirements(String loanRequirements);

    // Add more methods as per your requirements

}
