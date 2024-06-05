package com.test.repo.com.controller;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/loanApplications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/status/{status}")
    public List<LoanApplication> getLoanApplicationsByStatus(@PathVariable String status) {
        return loanApplicationService.getLoanApplicationsByStatus(status);
    }

    @GetMapping("/loanProduct/{loanProduct}")
    public List<LoanApplication> getLoanApplicationsByLoanProduct(@PathVariable String loanProduct) {
        return loanApplicationService.getLoanApplicationsByLoanProduct(loanProduct);
    }

    @GetMapping("/eligibilityCriteria/{eligibilityCriteria}")
    public List<LoanApplication> getLoanApplicationsByEligibilityCriteria(@PathVariable String eligibilityCriteria) {
        return loanApplicationService.getLoanApplicationsByEligibilityCriteria(eligibilityCriteria);
    }

    @GetMapping("/applicationDateRange")
    public List<LoanApplication> getLoanApplicationsByApplicationDateRange(@RequestParam Date startDate, @RequestParam Date endDate) {
        return loanApplicationService.getLoanApplicationsByApplicationDateRange(startDate, endDate);
    }

    @GetMapping("/regulatoryChanges/{regulatoryChanges}")
    public List<LoanApplication> getLoanApplicationsByRegulatoryChanges(@PathVariable String regulatoryChanges) {
        return loanApplicationService.getLoanApplicationsByRegulatoryChanges(regulatoryChanges);
    }

    @GetMapping("/businessProcessChanges/{businessProcessChanges}")
    public List<LoanApplication> getLoanApplicationsByBusinessProcessChanges(@PathVariable String businessProcessChanges) {
        return loanApplicationService.getLoanApplicationsByBusinessProcessChanges(businessProcessChanges);
    }

    @GetMapping("/version/{version}")
    public List<LoanApplication> getLoanApplicationsByVersion(@PathVariable int version) {
        return loanApplicationService.getLoanApplicationsByVersion(version);
    }
}