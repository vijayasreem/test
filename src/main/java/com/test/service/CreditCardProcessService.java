package com.test.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.repository.CreditCardProcess;
import com.test.repository.CreditCardProcessRepository;

@Service
public class CreditCardProcessService {
  
  @Autowired
  private CreditCardProcessRepository creditCardProcessRepository;
  
  public CreditCardProcess processCreditCardPayment(String creditCardInformation) {
    CreditCardProcess creditCardProcess = 
      creditCardProcessRepository.findByCreditCardInformation(creditCardInformation);
    if (creditCardProcess != null) {
      creditCardProcess.setNotification("Your payment is successful.");
      creditCardProcess.setPaymentProcess("COMPLETED");
      creditCardProcessRepository.save(creditCardProcess);
      return creditCardProcess;
    } else {
      return null;
    }
  }
  
  public Optional<CreditCardProcess> getCreditCardProcess(Long id) {
    return creditCardProcessRepository.findById(id);
  }
  
  public void deleteCreditCardProcess(Long id) {
    creditCardProcessRepository.deleteById(id);
  }
  
}