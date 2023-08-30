package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserStory {
    
    @Id
    private Integer id;
    private String storyTitle;
    private String description;
    private String assignedTeamMember;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedTeamMember() {
        return assignedTeamMember;
    }

    public void setAssignedTeamMember(String assignedTeamMember) {
        this.assignedTeamMember = assignedTeamMember;
    }

}