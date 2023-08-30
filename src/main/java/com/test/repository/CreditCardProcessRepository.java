package com.test.repository;

import org.springframework.data.repository.CrudRepository;

public interface CreditCardProcessRepository extends CrudRepository<CreditCardProcess, Long> {
  
  CreditCardProcess findByCreditCardInformation(String creditCardInformation);
  
  CreditCardProcess findByNotification(String notification);
  
  CreditCardProcess findByPaymentProcess(String paymentProcess);
  
  CreditCardProcess save(CreditCardProcess paymentProcess);
  
  void delete(CreditCardProcess paymentProcess);
}