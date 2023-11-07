package com.test.service;

import com.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isDocumentVerified(Long userId) {
        return userRepository.isDocumentVerified(userId);
    }

    public String getCreditEvaluation(Long userId) {
        return userRepository.getCreditEvaluation(userId);
    }
}