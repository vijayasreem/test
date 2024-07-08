package com.test.repo.com.controller;

import com.test.repo.com.model.LoanDisbursement;
import com.test.repo.com.service.LoanDisbursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/loan-disbursement")
public class LoanDisbursementController {

    private final LoanDisbursementService loanDisbursementService;

    @Autowired
    public LoanDisbursementController(LoanDisbursementService loanDisbursementService) {
        this.loanDisbursementService = loanDisbursementService;
    }

    @GetMapping("/recipient/{recipientName}")
    public ResponseEntity<List<LoanDisbursement>> findByRecipientName(@PathVariable String recipientName) {
        List<LoanDisbursement> loanDisbursements = loanDisbursementService.findByRecipientName(recipientName);
        return new ResponseEntity<>(loanDisbursements, HttpStatus.OK);
    }

    @GetMapping("/loan-amount-greater-than/{loanAmount}")
    public ResponseEntity<List<LoanDisbursement>> findByLoanAmountGreaterThan(@PathVariable double loanAmount) {
        List<LoanDisbursement> loanDisbursements = loanDisbursementService.findByLoanAmountGreaterThan(loanAmount);
        return new ResponseEntity<>(loanDisbursements, HttpStatus.OK);
    }

    @GetMapping("/disbursement-date-between")
    public ResponseEntity<List<LoanDisbursement>> findByDisbursementDateBetween(@RequestParam("startDate") Date startDate, @RequestParam("endDate") Date endDate) {
        List<LoanDisbursement> loanDisbursements = loanDisbursementService.findByDisbursementDateBetween(startDate, endDate);
        return new ResponseEntity<>(loanDisbursements, HttpStatus.OK);
    }

    @GetMapping("/disbursement-status/{disbursementStatus}")
    public ResponseEntity<List<LoanDisbursement>> findByDisbursementStatus(@PathVariable String disbursementStatus) {
        List<LoanDisbursement> loanDisbursements = loanDisbursementService.findByDisbursementStatus(disbursementStatus);
        return new ResponseEntity<>(loanDisbursements, HttpStatus.OK);
    }

    @GetMapping("/recipient/{recipientName}/disbursement-status/{disbursementStatus}")
    public ResponseEntity<List<LoanDisbursement>> findByRecipientNameAndDisbursementStatus(@PathVariable String recipientName, @PathVariable String disbursementStatus) {
        List<LoanDisbursement> loanDisbursements = loanDisbursementService.findByRecipientNameAndDisbursementStatus(recipientName, disbursementStatus);
        return new ResponseEntity<>(loanDisbursements, HttpStatus.OK);
    }

    // Add any additional custom methods or business logic as per your requirements

}