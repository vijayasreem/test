import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupInsuranceProductsRepository extends JpaRepository<GroupInsuranceProducts, Long> {
    List<GroupInsuranceProducts> findByMarketingTeamLeadGeneration();
    List<GroupInsuranceProducts> findByUnitNewBusinessConfigureMasterPolicies();
    List<GroupInsuranceProducts> findByZOApproveDeviations();
    List<GroupInsuranceProducts> findByCOApproveDecisions();
    List<GroupInsuranceProducts> findByActuarialTeamPerformValuations();
    List<GroupInsuranceProducts> findByReInsurerMakePricingDecisions();
    List<GroupInsuranceProducts> findByUnderwriterMakeUnderwritingPricingDecisions();
    List<GroupInsuranceProducts> findByMasterPolicyHolderManageMemberData();
    List<GroupInsuranceProducts> findByMemberAcknowledgeReceiptOfClaimForms();
    List<GroupInsuranceProducts> findByChannelUsersUpdateLeads();
}

package com.test.repository;