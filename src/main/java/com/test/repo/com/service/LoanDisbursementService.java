package com.test.repo.com.service;

import com.test.repo.com.model.LoanDisbursement;
import com.test.repo.com.repository.LoanDisbursementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanDisbursementService {

    private final LoanDisbursementRepository loanDisbursementRepository;

    @Autowired
    public LoanDisbursementService(LoanDisbursementRepository loanDisbursementRepository) {
        this.loanDisbursementRepository = loanDisbursementRepository;
    }

    public LoanDisbursement findByBankDetails(String bankDetails) {
        return loanDisbursementRepository.findByBankDetails(bankDetails);
    }

    public List<LoanDisbursement> findVerifiedLoanDisbursements() {
        return loanDisbursementRepository.findVerifiedLoanDisbursements();
    }

    public List<LoanDisbursement> findDisbursedLoanDisbursements() {
        return loanDisbursementRepository.findDisbursedLoanDisbursements();
    }

    // Add more business methods as per your requirements

}