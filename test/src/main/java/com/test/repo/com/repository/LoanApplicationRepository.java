Here is the Spring Boot repository code for the given user story:

```java
package com.test.repo.com.repository;

import com.test.repo.com.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
    
    LoanApplication findByLoanId(String loanId);
    
    // You can add more custom methods here if needed
    
}
```

Make sure to replace `com.test.repo.com.model` with the actual package name for your model class.

This repository interface extends the `JpaRepository` interface provided by Spring Data JPA, which gives you access to basic CRUD operations. The `findByLoanId` method is a custom method that retrieves the loan application details based on the Loan ID entered by the user.

You can add more custom methods to this repository interface if needed, based on your specific requirements.