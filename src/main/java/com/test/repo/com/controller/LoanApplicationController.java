package com.test.repo.com.controller;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan-application")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @PostMapping("/approve")
    public LoanApplication approveLoanApplication(@RequestBody LoanApplication loanApplication,
                                                  @RequestParam double approvedLoanAmount,
                                                  @RequestParam double approvedInterestRate,
                                                  @RequestParam int approvedRepaymentPeriod) {
        return loanApplicationService.approveLoanApplication(loanApplication, approvedLoanAmount, approvedInterestRate, approvedRepaymentPeriod);
    }

    @PostMapping("/disburse")
    public void disburseLoan(@RequestBody LoanApplication loanApplication) {
        loanApplicationService.disburseLoan(loanApplication);
    }
}