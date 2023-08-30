package com.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditCardProcess {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  private String creditCardInformation;
  private String notification;
  private String paymentProcess;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCreditCardInformation() {
    return creditCardInformation;
  }

  public void setCreditCardInformation(String creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
  }

  public String getNotification() {
    return notification;
  }

  public void setNotification(String notification) {
    this.notification = notification;
  }

  public String getPaymentProcess() {
    return paymentProcess;
  }

  public void setPaymentProcess(String paymentProcess) {
    this.paymentProcess = paymentProcess;
  }
  
}