
package com.test.repo.com.service;

import com.test.repo.com.model.CarMortgageLoan;
import com.test.repo.com.repository.CarMortgageLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarMortgageLoanService {

    private final CarMortgageLoanRepository carMortgageLoanRepository;

    @Autowired
    public CarMortgageLoanService(CarMortgageLoanRepository carMortgageLoanRepository) {
        this.carMortgageLoanRepository = carMortgageLoanRepository;
    }

    // Custom queries for car mortgage loan applications

    public CarMortgageLoan findByCustomerId(Long customerId) {
        return carMortgageLoanRepository.findByCustomerId(customerId);
    }

    public List<CarMortgageLoan> findByStatus(String status) {
        return carMortgageLoanRepository.findByStatus(status);
    }

    public List<CarMortgageLoan> findByLoanAmountLessThanEqual(Double loanAmount) {
        return carMortgageLoanRepository.findByLoanAmountLessThanEqual(loanAmount);
    }

    // Other required methods

    public List<CarMortgageLoan> findByCustomerName(String customerName) {
        return carMortgageLoanRepository.findByCustomerName(customerName);
    }

    public List<CarMortgageLoan> findByContactNumber(String contactNumber) {
        return carMortgageLoanRepository.findByContactNumber(contactNumber);
    }

    public List<CarMortgageLoan> findByEmploymentDetails(String employmentDetails) {
        return carMortgageLoanRepository.findByEmploymentDetails(employmentDetails);
    }

    public List<CarMortgageLoan> findByLoanRequirements(String loanRequirements) {
        return carMortgageLoanRepository.findByLoanRequirements(loanRequirements);
    }

    // Add more methods as per your requirements

}
