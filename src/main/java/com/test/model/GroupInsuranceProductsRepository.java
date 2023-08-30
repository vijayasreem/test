import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.GroupInsuranceProducts;

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

package com.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GroupInsuranceProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marketingTeamLeadGeneration;
    private String unitNewBusinessConfigureMasterPolicies;
    private String ZOApproveDeviations;
    private String COApproveDecisions;
    private String actuarialTeamPerformValuations;
    private String reInsurerMakePricingDecisions;
    private String underwriterMakeUnderwritingPricingDecisions;
    private String masterPolicyHolderManageMemberData;
    private String memberAcknowledgeReceiptOfClaimForms;
    private String channelUsersUpdateLeads;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarketingTeamLeadGeneration() {
        return marketingTeamLeadGeneration;
    }

    public void setMarketingTeamLeadGeneration(String marketingTeamLeadGeneration) {
        this.marketingTeamLeadGeneration = marketingTeamLeadGeneration;
    }

    public String getUnitNewBusinessConfigureMasterPolicies() {
        return unitNewBusinessConfigureMasterPolicies;
    }

    public void setUnitNewBusinessConfigureMasterPolicies(String unitNewBusinessConfigureMasterPolicies) {
        this.unitNewBusinessConfigureMasterPolicies = unitNewBusinessConfigureMasterPolicies;
    }

    public String getZOApproveDeviations() {
        return ZOApproveDeviations;
    }

    public void setZOApproveDeviations(String ZOApproveDeviations) {
        this.ZOApproveDeviations = ZOApproveDeviations;
    }

    public String getCOApproveDecisions() {
        return COApproveDecisions;
    }

    public void setCOApproveDecisions(String COApproveDecisions) {
        this.COApproveDecisions = COApproveDecisions;
    }

    public String getActuarialTeamPerformValuations() {
        return actuarialTeamPerformValuations;
    }

    public void setActuarialTeamPerformValuations(String actuarialTeamPerformValuations) {
        this.actuarialTeamPerformValuations = actuarialTeamPerformValuations;
    }

    public String getReInsurerMakePricingDecisions() {
        return reInsurerMakePricingDecisions;
    }

    public void setReInsurerMakePricingDecisions(String reInsurerMakePricingDecisions) {
        this.reInsurerMakePricingDecisions = reInsurerMakePricingDecisions;
    }

    public String getUnderwriterMakeUnderwritingPricingDecisions() {
        return underwriterMakeUnderwritingPricingDecisions;
    }

    public void setUnderwriterMakeUnderwritingPric