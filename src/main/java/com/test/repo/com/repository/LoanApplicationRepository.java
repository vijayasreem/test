
package com.test.repo.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
    
    List<LoanApplication> findByApplicantIdAndDocumentType(String applicantId, String documentType);
    
    List<LoanApplication> findByApplicantId(String applicantId);
    
    List<LoanApplication> findByDocumentType(String documentType);
    
    List<LoanApplication> findByApplicantIdAndDocumentTypeAndVerified(String applicantId, String documentType, boolean verified);
    
    List<LoanApplication> findByEligibilityStatus(boolean eligibilityStatus);
    
    @Query("SELECT COUNT(l) FROM LoanApplication l WHERE l.applicantId = ?1 AND l.documentType = ?2")
    int countByApplicantIdAndDocumentType(String applicantId, String documentType);
    
    @Query("SELECT COUNT(l) FROM LoanApplication l WHERE l.applicantId = ?1 AND l.documentType = ?2 AND l.verified = true")
    int countByApplicantIdAndDocumentTypeAndVerified(String applicantId, String documentType);
    
    @Query("SELECT COUNT(l) FROM LoanApplication l WHERE l.applicantId = ?1 AND l.eligibilityStatus = true")
    int countByApplicantIdAndEligibilityStatus(String applicantId);
    
    @Query("SELECT COUNT(l) FROM LoanApplication l WHERE l.eligibilityStatus = true")
    int countByEligibilityStatusTrue();
    
    @Query("SELECT COUNT(l) FROM LoanApplication l WHERE l.eligibilityStatus = false")
    int countByEligibilityStatusFalse();
    
}
