Sure! Here is a Spring Boot Controller class for the given service classes:

```java
package com.test.repo.com.controller;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/{loanId}")
    public LoanApplication getLoanApplication(@PathVariable String loanId) {
        return loanApplicationService.findByLoanId(loanId);
    }

    // Add more controller methods for other operations if needed

}
```

In this example, the `LoanApplicationController` class is annotated with `@RestController` to indicate that it is a Spring MVC Controller that handles HTTP requests and returns JSON responses.

The `LoanApplicationController` class has a constructor that takes an instance of `LoanApplicationService` as a parameter and uses constructor-based dependency injection to inject the service bean.

The `getLoanApplication` method is mapped to the `/loan-applications/{loanId}` endpoint using the `@GetMapping` annotation. It retrieves the loan application details based on the loan ID by calling the `findByLoanId` method of the `LoanApplicationService` and returns the result as a JSON response.

You can add more controller methods to this class for other operations such as creating, updating, or deleting loan applications, based on your specific requirements.

Please make sure the package name and imports are adjusted according to your project structure.