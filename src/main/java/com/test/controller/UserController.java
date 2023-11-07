package com.test.controller;

import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/{userId}/documentVerification")
    public boolean isDocumentVerified(@PathVariable Long userId) {
        return userService.isDocumentVerified(userId);
    }

    @RequestMapping("/{userId}/creditEvaluation")
    public String getCreditEvaluation(@PathVariable Long userId) {
        return userService.getCreditEvaluation(userId);
    }
}