package com.test.repo.com.controller;

import com.test.repo.com.model.LoanApplication;
import com.test.repo.com.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/loan-applications")
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

    @GetMapping("/loan-product/{loanProduct}")
    public List<LoanApplication> getLoanApplicationsByLoanProduct(@PathVariable String loanProduct) {
        return loanApplicationService.getLoanApplicationsByLoanProduct(loanProduct);
    }

    @GetMapping("/eligibility-criteria/{eligibilityCriteria}")
    public List<LoanApplication> getLoanApplicationsByEligibilityCriteria(@PathVariable String eligibilityCriteria) {
        return loanApplicationService.getLoanApplicationsByEligibilityCriteria(eligibilityCriteria);
    }

    @GetMapping("/application-date-range")
    public List<LoanApplication> getLoanApplicationsByApplicationDateRange(@RequestParam Date startDate, @RequestParam Date endDate) {
        return loanApplicationService.getLoanApplicationsByApplicationDateRange(startDate, endDate);
    }

    @GetMapping("/regulatory-changes/{regulatoryChanges}")
    public List<LoanApplication> getLoanApplicationsByRegulatoryChanges(@PathVariable String regulatoryChanges) {
        return loanApplicationService.getLoanApplicationsByRegulatoryChanges(regulatoryChanges);
    }

    @GetMapping("/business-process-changes/{businessProcessChanges}")
    public List<LoanApplication> getLoanApplicationsByBusinessProcessChanges(@PathVariable String businessProcessChanges) {
        return loanApplicationService.getLoanApplicationsByBusinessProcessChanges(businessProcessChanges);
    }

    @GetMapping("/configuration-and-customization")
    public List<LoanApplication> getLoanApplicationsByConfigurationAndCustomization(@RequestParam String configuration, @RequestParam String customization) {
        return loanApplicationService.getLoanApplicationsByConfigurationAndCustomization(configuration, customization);
    }

    @GetMapping("/version-control/{versionControl}")
    public List<LoanApplication> getLoanApplicationsByVersionControl(@PathVariable String versionControl) {
        return loanApplicationService.getLoanApplicationsByVersionControl(versionControl);
    }

    @GetMapping("/documentation-and-training-materials")
    public List<LoanApplication> getLoanApplicationsByDocumentationAndTrainingMaterials(@RequestParam String documentation, @RequestParam String trainingMaterials) {
        return loanApplicationService.getLoanApplicationsByDocumentationAndTrainingMaterials(documentation, trainingMaterials);
    }
}