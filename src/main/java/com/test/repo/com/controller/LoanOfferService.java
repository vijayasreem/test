
package com.test.repo.com.service;

import com.test.repo.com.entity.LoanOffer;
import com.test.repo.com.repo.LoanOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanOfferService {

    @Autowired
    private LoanOfferRepository loanOfferRepository;

    public LoanOffer createLoanOffer(LoanOffer loanOffer) {
        // Business logic to ensure clarity of terms and conditions
        // Add additional logic as per the acceptance criteria
        return loanOfferRepository.save(loanOffer);
    }

    public Optional<LoanOffer> getLoanOfferById(Long id) {
        return loanOfferRepository.findById(id);
    }

    public List<LoanOffer> getAllLoanOffers() {
        return loanOfferRepository.findAll();
    }

    public LoanOffer updateLoanOffer(Long id, LoanOffer loanOfferDetails) {
        Optional<LoanOffer> optionalLoanOffer = loanOfferRepository.findById(id);
        if (optionalLoanOffer.isPresent()) {
            LoanOffer loanOffer = optionalLoanOffer.get();
            // Update the loan offer details
            loanOffer.setAmount(loanOfferDetails.getAmount());
            loanOffer.setInterestRate(loanOfferDetails.getInterestRate());
            loanOffer.setRepaymentPeriod(loanOfferDetails.getRepaymentPeriod());
            loanOffer.setFees(loanOfferDetails.getFees());
            // Add additional fields as per the acceptance criteria
            return loanOfferRepository.save(loanOffer);
        } else {
            throw new RuntimeException("Loan Offer not found with id " + id);
        }
    }

    public void deleteLoanOffer(Long id) {
        loanOfferRepository.deleteById(id);
    }
}
