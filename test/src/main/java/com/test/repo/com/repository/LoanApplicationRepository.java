Here is a sample Spring Boot repository class for the given input:

```java
package com.test.repo.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.repo.com.model.LoanApplication;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
    LoanApplication findByLoanId(String loanId);
}
```

In this repository, we extend the `JpaRepository` interface and specify the entity class `LoanApplication` and its primary key type `Long`. The `findByLoanId` method is added to search for a loan application record based on the loanId.

Please note that this repository assumes you have a `LoanApplication` entity class with the required fields and annotations mapping to the `Loan_Application__c` object in Salesforce.