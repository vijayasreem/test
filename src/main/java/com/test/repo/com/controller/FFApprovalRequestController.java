package com.test.repo.com.controller;

import com.test.repo.com.model.FFApprovalRequest;
import com.test.repo.com.service.FFApprovalRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/approval-requests")
public class FFApprovalRequestController {

    private final FFApprovalRequestService ffApprovalRequestService;

    @Autowired
    public FFApprovalRequestController(FFApprovalRequestService ffApprovalRequestService) {
        this.ffApprovalRequestService = ffApprovalRequestService;
    }

    @GetMapping("/pending")
    public List<FFApprovalRequest> findPendingRequests() {
        return ffApprovalRequestService.findPendingRequests();
    }

    @GetMapping("/{id}")
    public FFApprovalRequest findPendingRequestById(@PathVariable Long id) {
        return ffApprovalRequestService.findPendingRequestById(id);
    }

    @GetMapping("/owner/{owner}")
    public List<FFApprovalRequest> findPendingRequestsByOwner(@PathVariable String owner) {
        return ffApprovalRequestService.findPendingRequestsByOwner(owner);
    }

    // Add more business methods as needed

}