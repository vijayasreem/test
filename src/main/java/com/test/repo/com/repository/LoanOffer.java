
package com.test.repo.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class LoanOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double loanAmount;
    private Double interestRate;
    private Integer repaymentPeriod;
    private Double fees;
    private LocalDate offerDate;
    private String termsAndConditions;
    private String repaymentSchedule;
    private String penalties;
    private String conditions;
    private String customerSupportContact;
    private String faqLink;
    private Boolean isAccessible;
    private Boolean isConfirmed;

    // Getters and Setters
    // ...
}
