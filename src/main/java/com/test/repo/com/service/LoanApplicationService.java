package com.test.repo.com.service;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public LoanApplication approveLoanApplication(LoanApplication loanApplication, double approvedLoanAmount, double approvedInterestRate, int approvedRepaymentPeriod) {
        // Validate approved loan amount
        if (approvedLoanAmount > loanApplication.getMaxLoanAmount()) {
            throw new IllegalArgumentException("Approved loan amount exceeds maximum limit");
        }

        // Validate approved interest rate
        if (approvedInterestRate < loanApplication.getMinInterestRate() || approvedInterestRate > loanApplication.getMaxInterestRate()) {
            throw new IllegalArgumentException("Approved interest rate is outside the allowed range");
        }

        // Validate approved repayment period
        if (approvedRepaymentPeriod < loanApplication.getMinRepaymentPeriod() || approvedRepaymentPeriod > loanApplication.getMaxRepaymentPeriod()) {
            throw new IllegalArgumentException("Approved repayment period is outside the allowed range");
        }

        // Update loan application details
        loanApplication.setApprovedLoanAmount(approvedLoanAmount);
        loanApplication.setApprovedInterestRate(approvedInterestRate);
        loanApplication.setApprovedRepaymentPeriod(approvedRepaymentPeriod);
        loanApplication.setStatus("APPROVED");

        // Save the updated loan application
        return loanApplicationRepository.save(loanApplication);
    }

    public void disburseLoan(LoanApplication loanApplication) {
        // Validate loan application status
        if (!loanApplication.getStatus().equals("APPROVED")) {
            throw new IllegalStateException("Loan application must be approved before disbursement");
        }

        // Perform loan disbursement process
        // ...

        // Update loan application status
        loanApplication.setStatus("DISBURSED");

        // Save the updated loan application
        loanApplicationRepository.save(loanApplication);
    }
}