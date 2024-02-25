Sure! Here is an example of a Spring Boot controller class that uses the provided service classes and package name "com.test.repo.com.controller":

```java
package com.test.repo.com.controller;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/{loanId}")
    public ResponseEntity<LoanApplication> getLoanApplication(@PathVariable String loanId) {
        LoanApplication loanApplication = loanApplicationService.findByLoanId(loanId);
        if (loanApplication != null) {
            return ResponseEntity.ok(loanApplication);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Add other controller methods as needed

}
```

In this example, the `LoanApplicationController` class is annotated with `@RestController` to indicate that it is a RESTful controller. We use the `LoanApplicationService` to retrieve the loan application data and return it as a response entity.

The `@GetMapping` annotation is used to map the GET request to the "/loan-applications/{loanId}" endpoint, where {loanId} is a path variable. The `getLoanApplication` method retrieves the loan application by calling the `findByLoanId` method of the service class and returns a response entity.

You can add additional controller methods to handle other API endpoints as needed. Remember to adjust the package name and imports according to your project's structure.