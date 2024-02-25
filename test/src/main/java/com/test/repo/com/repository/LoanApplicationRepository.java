As an assistant, I can help you with the Spring Boot Repository code. Here is an example of a LoanApplicationRepository with the required methods:

```java
package com.test.repo.com.repository;

import com.test.repo.com.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    LoanApplication findByLoanId(String loanId);

    // Add any additional methods required for your application

}
```

Please note that you might need to create the `LoanApplication` entity class in the `com.test.repo.com.model` package as well.