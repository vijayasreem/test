package com.test.repo.com.controller;

import com.test.repo.com.model.LoanDisbursement;
import com.test.repo.com.service.LoanDisbursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan-disbursement")
public class LoanDisbursementController {

    private final LoanDisbursementService loanDisbursementService;

    @Autowired
    public LoanDisbursementController(LoanDisbursementService loanDisbursementService) {
        this.loanDisbursementService = loanDisbursementService;
    }

    @GetMapping("/findByBankDetails")
    public LoanDisbursement findByBankDetails(@RequestParam String bankDetails) {
        return loanDisbursementService.findByBankDetails(bankDetails);
    }

    @GetMapping("/findVerifiedLoanDisbursements")
    public List<LoanDisbursement> findVerifiedLoanDisbursements() {
        return loanDisbursementService.findVerifiedLoanDisbursements();
    }

    @GetMapping("/findDisbursedLoanDisbursements")
    public List<LoanDisbursement> findDisbursedLoanDisbursements() {
        return loanDisbursementService.findDisbursedLoanDisbursements();
    }

    // Add more API endpoints and business methods as per your requirements

}