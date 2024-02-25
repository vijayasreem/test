Here is a sample Spring Boot service class that uses the provided repository:

```java
package com.test.repo.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.repository.LoanApplicationRepository;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public LoanApplication findByLoanId(String loanId) {
        return loanApplicationRepository.findByLoanId(loanId);
    }

    // Add additional service methods as needed
}
```

In this service class, we use the `LoanApplicationRepository` to interact with the database. The `findByLoanId` method is implemented to delegate the call to the repository's `findByLoanId` method.

Please note that you can add additional service methods as per your requirements.