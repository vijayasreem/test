package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.repository.FetchUserStoriesRepository;

@Service
public class FetchUserStoriesService {

    @Autowired
    private FetchUserStoriesRepository fetchUserStoriesRepository;

    public List<Object> fetchUserStories() {
        return this.fetchUserStoriesRepository.fetchUserStories();
    }

    public Object getUserStoryByDetails(String storyTitle, String description, String assignedTeamMember) {
        return this.fetchUserStoriesRepository.getUserStoryByDetails(storyTitle, description, assignedTeamMember);
    }

    public Object getUserStoryByTitle(String storyTitle) {
        return this.fetchUserStoriesRepository.getUserStoryByTitle(storyTitle);
    }

    public Object getUserStoryByDescription(String description) {
        return this.fetchUserStoriesRepository.getUserStoryByDescription(description);
    }

    public Object getUserStoryByAssignedTeamMember(String assignedTeamMember) {
        return this.fetchUserStoriesRepository.getUserStoryByAssignedTeamMember(assignedTeamMember);
    }
}