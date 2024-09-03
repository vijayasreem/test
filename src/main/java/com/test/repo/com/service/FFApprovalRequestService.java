package com.test.repo.com.service;

import com.test.repo.com.model.FFApprovalRequest;
import com.test.repo.com.repository.FFApprovalRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FFApprovalRequestService {

    private final FFApprovalRequestRepository ffApprovalRequestRepository;

    @Autowired
    public FFApprovalRequestService(FFApprovalRequestRepository ffApprovalRequestRepository) {
        this.ffApprovalRequestRepository = ffApprovalRequestRepository;
    }

    public List<FFApprovalRequest> findPendingRequests() {
        return ffApprovalRequestRepository.findPendingRequests();
    }

    public FFApprovalRequest findPendingRequestById(Long id) {
        return ffApprovalRequestRepository.findPendingRequestById(id);
    }

    public List<FFApprovalRequest> findPendingRequestsByOwner(String owner) {
        return ffApprovalRequestRepository.findPendingRequestsByOwner(owner);
    }

    // Add more business methods as needed

}