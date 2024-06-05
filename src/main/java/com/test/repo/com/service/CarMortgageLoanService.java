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

    // Custom queries for specific requirements

    public CarMortgageLoan findById(long id) {
        return carMortgageLoanRepository.findById(id);
    }

    public List<CarMortgageLoan> findByCustomerName(String customerName) {
        return carMortgageLoanRepository.findByCustomerName(customerName);
    }

    public List<CarMortgageLoan> findByApplicationStatus(String applicationStatus) {
        return carMortgageLoanRepository.findByApplicationStatus(applicationStatus);
    }

    public List<CarMortgageLoan> findByApplicationChannel(String applicationChannel) {
        return carMortgageLoanRepository.findByApplicationChannel(applicationChannel);
    }

    public List<CarMortgageLoan> findByCustomerNameAndApplicationStatus(String customerName, String applicationStatus) {
        return carMortgageLoanRepository.findByCustomerNameAndApplicationStatus(customerName, applicationStatus);
    }

    public List<CarMortgageLoan> findByCustomerNameAndApplicationChannel(String customerName, String applicationChannel) {
        return carMortgageLoanRepository.findByCustomerNameAndApplicationChannel(customerName, applicationChannel);
    }

    public List<CarMortgageLoan> findByApplicationStatusAndApplicationChannel(String applicationStatus, String applicationChannel) {
        return carMortgageLoanRepository.findByApplicationStatusAndApplicationChannel(applicationStatus, applicationChannel);
    }

    public List<CarMortgageLoan> findByCustomerNameAndApplicationStatusAndApplicationChannel(String customerName, String applicationStatus, String applicationChannel) {
        return carMortgageLoanRepository.findByCustomerNameAndApplicationStatusAndApplicationChannel(customerName, applicationStatus, applicationChannel);
    }

    // Other required methods

    public CarMortgageLoan save(CarMortgageLoan loanApplication) {
        return carMortgageLoanRepository.save(loanApplication);
    }

    public void deleteById(long id) {
        carMortgageLoanRepository.deleteById(id);
    }
}