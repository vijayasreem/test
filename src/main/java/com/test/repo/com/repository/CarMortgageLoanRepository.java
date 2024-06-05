
package com.test.repo.com.repository;

import com.test.repo.com.model.CarMortgageLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarMortgageLoanRepository extends JpaRepository<CarMortgageLoan, Long> {

    // Custom queries for specific requirements

    // Query to find a loan application by ID
    CarMortgageLoan findById(long id);

    // Query to find loan applications by customer name
    List<CarMortgageLoan> findByCustomerName(String customerName);

    // Query to find loan applications by application status
    List<CarMortgageLoan> findByApplicationStatus(String applicationStatus);

    // Query to find loan applications by application channel (website, mobile app, in-person)
    List<CarMortgageLoan> findByApplicationChannel(String applicationChannel);

    // Query to find loan applications by customer name and application status
    List<CarMortgageLoan> findByCustomerNameAndApplicationStatus(String customerName, String applicationStatus);

    // Query to find loan applications by customer name and application channel
    List<CarMortgageLoan> findByCustomerNameAndApplicationChannel(String customerName, String applicationChannel);

    // Query to find loan applications by application status and application channel
    List<CarMortgageLoan> findByApplicationStatusAndApplicationChannel(String applicationStatus, String applicationChannel);

    // Query to find loan applications by customer name, application status, and application channel
    List<CarMortgageLoan> findByCustomerNameAndApplicationStatusAndApplicationChannel(String customerName, String applicationStatus, String applicationChannel);

    // Other required methods

    // Method to save a new loan application
    CarMortgageLoan save(CarMortgageLoan loanApplication);

    // Method to delete a loan application by ID
    void deleteById(long id);

}
