package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.FetchUserStoriesService;

@RestController
public class FetchUserStoriesController {

    @Autowired
    private FetchUserStoriesService fetchUserStoriesService;

    @GetMapping("/fetchUserStories")
    @ResponseBody
    public List<Object> fetchUserStories() {
        return this.fetchUserStoriesService.fetchUserStories();
    }

    @GetMapping("/getUserStoryByDetails")
    @ResponseBody
    public Object getUserStoryByDetails(@RequestParam String storyTitle,
                                       @RequestParam String description,
                                       @RequestParam String assignedTeamMember) {
        return this.fetchUserStoriesService.getUserStoryByDetails(storyTitle, description, assignedTeamMember);
    }

    @GetMapping("/getUserStoryByTitle")
    @ResponseBody
    public Object getUserStoryByTitle(@RequestParam String storyTitle) {
        return this.fetchUserStoriesService.getUserStoryByTitle(storyTitle);
    }

    @GetMapping("/getUserStoryByDescription")
    @ResponseBody
    public Object getUserStoryByDescription(@RequestParam String description) {
        return this.fetchUserStoriesService.getUserStoryByDescription(description);
    }

    @GetMapping("/getUserStoryByAssignedTeamMember")
    @ResponseBody
    public Object getUserStoryByAssignedTeamMember(@RequestParam String assignedTeamMember) {
        return this.fetchUserStoriesService.getUserStoryByAssignedTeamMember(assignedTeamMember);
    }
}