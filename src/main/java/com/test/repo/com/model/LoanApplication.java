
package com.test.repo.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String channel;
    private String status;
    private Long customerId;
    private String applicationId;
    private boolean additionalDocumentationRequired;
    private String estimatedTimeline;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public boolean isAdditionalDocumentationRequired() {
        return additionalDocumentationRequired;
    }

    public void setAdditionalDocumentationRequired(boolean additionalDocumentationRequired) {
        this.additionalDocumentationRequired = additionalDocumentationRequired;
    }

    public String getEstimatedTimeline() {
        return estimatedTimeline;
    }

    public void setEstimatedTimeline(String estimatedTimeline) {
        this.estimatedTimeline = estimatedTimeline;
    }
}
