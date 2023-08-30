package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface FetchUserStoriesRepository extends JpaRepository<Object, Integer> {
    
    @Query("SELECT * FROM jira_stories")
    List<Object> fetchUserStories();
    
    @Query("SELECT * FROM jira_stories WHERE story_title = ?1 AND description = ?2 AND assigned_team_member = ?3")
    Object getUserStoryByDetails(String storyTitle, String description, String assignedTeamMember);
    
    @Query("SELECT * FROM jira_stories WHERE story_title = ?1")
    Object getUserStoryByTitle(String storyTitle);
    
    @Query("SELECT * FROM jira_stories WHERE description = ?1")
    Object getUserStoryByDescription(String description);
    
    @Query("SELECT * FROM jira_stories WHERE assigned_team_member = ?1")
    Object getUserStoryByAssignedTeamMember(String assignedTeamMember);

}