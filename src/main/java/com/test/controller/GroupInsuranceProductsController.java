package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.repository.GroupInsuranceProducts;
import com.test.service.GroupInsuranceProductsService;

@RestController
public class GroupInsuranceProductsController {
    @Autowired
    GroupInsuranceProductsService groupInsuranceProductsService;

    @GetMapping("/marketingTeamLeadGeneration")
    public List<GroupInsuranceProducts> getMarketingTeamLeadGeneration() {
        return groupInsuranceProductsService.findByMarketingTeamLeadGeneration();
    }

    @GetMapping("/unitNewBusinessConfigureMasterPolicies")
    public List<GroupInsuranceProducts> getUnitNewBusinessConfigureMasterPolicies() {
        return groupInsuranceProductsService.findByUnitNewBusinessConfigureMasterPolicies();
    }

    @GetMapping("/zoApproveDeviations")
    public List<GroupInsuranceProducts> getZOApproveDeviations() {
        return groupInsuranceProductsService.findByZOApproveDeviations();
    }

    @GetMapping("/coApproveDecisions")
    public List<GroupInsuranceProducts> getCOApproveDecisions() {
        return groupInsuranceProductsService.findByCOApproveDecisions();
    }

    @GetMapping("/actuarialTeamPerformValuations")
    public List<GroupInsuranceProducts> getActuarialTeamPerformValuations() {
        return groupInsuranceProductsService.findByActuarialTeamPerformValuations();
    }

    @GetMapping("/reInsurerMakePricingDecisions")
    public List<GroupInsuranceProducts> getReInsurerMakePricingDecisions() {
        return groupInsuranceProductsService.findByReInsurerMakePricingDecisions();
    }

    @GetMapping("/underwriterMakeUnderwritingPricingDecisions")
    public List<GroupInsuranceProducts> getUnderwriterMakeUnderwritingPricingDecisions() {
        return groupInsuranceProductsService.findByUnderwriterMakeUnderwritingPricingDecisions();
    }

    @GetMapping("/masterPolicyHolderManageMemberData")
    public List<GroupInsuranceProducts> getMasterPolicyHolderManageMemberData() {
        return groupInsuranceProductsService.findByMasterPolicyHolderManageMemberData();
    }

    @GetMapping("/memberAcknowledgeReceiptOfClaimForms")
    public List<GroupInsuranceProducts> getMemberAcknowledgeReceiptOfClaimForms() {
        return groupInsuranceProductsService.findByMemberAcknowledgeReceiptOfClaimForms();
    }

    @GetMapping("/channelUsersUpdateLeads")
    public List<GroupInsuranceProducts> getChannelUsersUpdateLeads() {
        return groupInsuranceProductsService.findByChannelUsersUpdateLeads();
    }
}