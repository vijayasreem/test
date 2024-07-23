package com.test.repo.com.controller;

import com.test.repo.com.model.CarMortgageLoan;
import com.test.repo.com.service.CarMortgageLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car-mortgage-loan")
public class CarMortgageLoanController {

    private final CarMortgageLoanService carMortgageLoanService;

    @Autowired
    public CarMortgageLoanController(CarMortgageLoanService carMortgageLoanService) {
        this.carMortgageLoanService = carMortgageLoanService;
    }

    @GetMapping("/customer/{customerId}")
    public CarMortgageLoan findByCustomerId(@PathVariable Long customerId) {
        return carMortgageLoanService.findByCustomerId(customerId);
    }

    @GetMapping("/status/{status}")
    public List<CarMortgageLoan> findByStatus(@PathVariable String status) {
        return carMortgageLoanService.findByStatus(status);
    }

    @GetMapping("/loan-amount/{loanAmount}")
    public List<CarMortgageLoan> findByLoanAmountLessThanEqual(@PathVariable Double loanAmount) {
        return carMortgageLoanService.findByLoanAmountLessThanEqual(loanAmount);
    }

    @GetMapping("/customer-name/{customerName}")
    public List<CarMortgageLoan> findByCustomerName(@PathVariable String customerName) {
        return carMortgageLoanService.findByCustomerName(customerName);
    }

    @GetMapping("/contact-number/{contactNumber}")
    public List<CarMortgageLoan> findByContactNumber(@PathVariable String contactNumber) {
        return carMortgageLoanService.findByContactNumber(contactNumber);
    }

    @GetMapping("/employment-details/{employmentDetails}")
    public List<CarMortgageLoan> findByEmploymentDetails(@PathVariable String employmentDetails) {
        return carMortgageLoanService.findByEmploymentDetails(employmentDetails);
    }

    @GetMapping("/loan-requirements/{loanRequirements}")
    public List<CarMortgageLoan> findByLoanRequirements(@PathVariable String loanRequirements) {
        return carMortgageLoanService.findByLoanRequirements(loanRequirements);
    }

    // Add more methods as per your requirements

}