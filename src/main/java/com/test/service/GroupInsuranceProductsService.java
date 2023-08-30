package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.repository.GroupInsuranceProducts;
import com.test.repository.GroupInsuranceProductsRepository;

@Service
public class GroupInsuranceProductsService {
    @Autowired
    GroupInsuranceProductsRepository groupInsuranceProductsRepository;

    public List<GroupInsuranceProducts> findByMarketingTeamLeadGeneration() {
        return groupInsuranceProductsRepository.findByMarketingTeamLeadGeneration();
    }

    public List<GroupInsuranceProducts> findByUnitNewBusinessConfigureMasterPolicies() {
        return groupInsuranceProductsRepository.findByUnitNewBusinessConfigureMasterPolicies();
    }

    public List<GroupInsuranceProducts> findByZOApproveDeviations() {
        return groupInsuranceProductsRepository.findByZOApproveDeviations();
    }

    public List<GroupInsuranceProducts> findByCOApproveDecisions() {
        return groupInsuranceProductsRepository.findByCOApproveDecisions();
    }

    public List<GroupInsuranceProducts> findByActuarialTeamPerformValuations() {
        return groupInsuranceProductsRepository.findByActuarialTeamPerformValuations();
    }

    public List<GroupInsuranceProducts> findByReInsurerMakePricingDecisions() {
        return groupInsuranceProductsRepository.findByReInsurerMakePricingDecisions();
    }

    public List<GroupInsuranceProducts> findByUnderwriterMakeUnderwritingPricingDecisions() {
        return groupInsuranceProductsRepository.findByUnderwriterMakeUnderwritingPricingDecisions();
    }

    public List<GroupInsuranceProducts> findByMasterPolicyHolderManageMemberData() {
        return groupInsuranceProductsRepository.findByMasterPolicyHolderManageMemberData();
    }

    public List<GroupInsuranceProducts> findByMemberAcknowledgeReceiptOfClaimForms() {
        return groupInsuranceProductsRepository.findByMemberAcknowledgeReceiptOfClaimForms();
    }

    public List<GroupInsuranceProducts> findByChannelUsersUpdateLeads() {
        return groupInsuranceProductsRepository.findByChannelUsersUpdateLeads();
    }
}