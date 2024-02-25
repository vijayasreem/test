Sure, here is the Spring Boot Service class for the given repository:

```java
package com.test.repo.com.service;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
```

In this example, the `LoanApplicationService` class is annotated with `@Service` to indicate that it is a Spring-managed service component.

The `LoanApplicationService` class has a constructor that takes an instance of `LoanApplicationRepository` as a parameter and uses constructor-based dependency injection to inject the repository bean.

The `findByLoanId` method delegates the call to the repository's `findByLoanId` method to retrieve the loan application details based on the loan ID.

Please make sure the package name and imports are adjusted according to your project structure.