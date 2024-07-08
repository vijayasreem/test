package com.test.repo.com.service;

import com.test.repo.com.model.LoanDisbursement;
import com.test.repo.com.repository.LoanDisbursementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LoanDisbursementService {

    private final LoanDisbursementRepository loanDisbursementRepository;

    @Autowired
    public LoanDisbursementService(LoanDisbursementRepository loanDisbursementRepository) {
        this.loanDisbursementRepository = loanDisbursementRepository;
    }

    public List<LoanDisbursement> findByRecipientName(String recipientName) {
        return loanDisbursementRepository.findByRecipientName(recipientName);
    }

    public List<LoanDisbursement> findByLoanAmountGreaterThan(double loanAmount) {
        return loanDisbursementRepository.findByLoanAmountGreaterThan(loanAmount);
    }

    public List<LoanDisbursement> findByDisbursementDateBetween(Date startDate, Date endDate) {
        return loanDisbursementRepository.findByDisbursementDateBetween(startDate, endDate);
    }

    public List<LoanDisbursement> findByDisbursementStatus(String disbursementStatus) {
        return loanDisbursementRepository.findByDisbursementStatus(disbursementStatus);
    }

    public List<LoanDisbursement> findByRecipientNameAndDisbursementStatus(String recipientName, String disbursementStatus) {
        return loanDisbursementRepository.findByRecipientNameAndDisbursementStatus(recipientName, disbursementStatus);
    }

    // Add any additional custom methods or business logic as per your requirements

}