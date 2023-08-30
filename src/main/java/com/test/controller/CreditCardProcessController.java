package com.test.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.repository.CreditCardProcess;
import com.test.service.CreditCardProcessService;

@RestController
@RequestMapping("/credit-card-process")
public class CreditCardProcessController {
  
  @Autowired
  private CreditCardProcessService creditCardProcessService;

  @PostMapping
  public ResponseEntity<CreditCardProcess> processCreditCardPayment(@RequestBody String creditCardInformation) {
    CreditCardProcess creditCardProcess = creditCardProcessService.processCreditCardPayment(creditCardInformation);
    if (creditCardProcess != null) {
      return ResponseEntity.status(HttpStatus.CREATED).body(creditCardProcess);
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<CreditCardProcess>> getCreditCardProcess(@PathVariable Long id) {
    Optional<CreditCardProcess> creditCardProcess = creditCardProcessService.getCreditCardProcess(id);
    if (creditCardProcess.isPresent()) {
      return ResponseEntity.status(HttpStatus.OK).body(creditCardProcess);
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteCreditCardProcess(@PathVariable Long id) {
    creditCardProcessService.deleteCreditCardProcess(id);
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }

}