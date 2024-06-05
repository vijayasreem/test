package com.test.repo.com.controller;

import com.test.repo.com.model.CarMortgageLoan;
import com.test.repo.com.service.CarMortgageLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class CarMortgageLoanController {

    private final CarMortgageLoanService carMortgageLoanService;

    @Autowired
    public CarMortgageLoanController(CarMortgageLoanService carMortgageLoanService) {
        this.carMortgageLoanService = carMortgageLoanService;
    }

    @GetMapping("/{id}")
    public CarMortgageLoan getLoanById(@PathVariable long id) {
        return carMortgageLoanService.findById(id);
    }

    @GetMapping("/customer/{customerName}")
    public List<CarMortgageLoan> getLoansByCustomerName(@PathVariable String customerName) {
        return carMortgageLoanService.findByCustomerName(customerName);
    }

    @GetMapping("/status/{applicationStatus}")
    public List<CarMortgageLoan> getLoansByApplicationStatus(@PathVariable String applicationStatus) {
        return carMortgageLoanService.findByApplicationStatus(applicationStatus);
    }

    @GetMapping("/channel/{applicationChannel}")
    public List<CarMortgageLoan> getLoansByApplicationChannel(@PathVariable String applicationChannel) {
        return carMortgageLoanService.findByApplicationChannel(applicationChannel);
    }

    @GetMapping("/customer/{customerName}/status/{applicationStatus}")
    public List<CarMortgageLoan> getLoansByCustomerNameAndApplicationStatus(@PathVariable String customerName, @PathVariable String applicationStatus) {
        return carMortgageLoanService.findByCustomerNameAndApplicationStatus(customerName, applicationStatus);
    }

    @GetMapping("/customer/{customerName}/channel/{applicationChannel}")
    public List<CarMortgageLoan> getLoansByCustomerNameAndApplicationChannel(@PathVariable String customerName, @PathVariable String applicationChannel) {
        return carMortgageLoanService.findByCustomerNameAndApplicationChannel(customerName, applicationChannel);
    }

    @GetMapping("/status/{applicationStatus}/channel/{applicationChannel}")
    public List<CarMortgageLoan> getLoansByApplicationStatusAndApplicationChannel(@PathVariable String applicationStatus, @PathVariable String applicationChannel) {
        return carMortgageLoanService.findByApplicationStatusAndApplicationChannel(applicationStatus, applicationChannel);
    }

    @GetMapping("/customer/{customerName}/status/{applicationStatus}/channel/{applicationChannel}")
    public List<CarMortgageLoan> getLoansByCustomerNameAndApplicationStatusAndApplicationChannel(@PathVariable String customerName, @PathVariable String applicationStatus, @PathVariable String applicationChannel) {
        return carMortgageLoanService.findByCustomerNameAndApplicationStatusAndApplicationChannel(customerName, applicationStatus, applicationChannel);
    }

    @PostMapping
    public CarMortgageLoan createLoan(@RequestBody CarMortgageLoan loanApplication) {
        return carMortgageLoanService.save(loanApplication);
    }

    @DeleteMapping("/{id}")
    public void deleteLoanById(@PathVariable long id) {
        carMortgageLoanService.deleteById(id);
    }
}