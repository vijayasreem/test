
package com.test.repository;

import com.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT CASE WHEN (u.identityVerified = true AND u.addressVerified = true) " +
            "THEN true ELSE false END FROM User u WHERE u.id = :userId")
    boolean isDocumentVerified(Long userId);

    @Query("SELECT CASE WHEN (u.annualIncome >= 30000 AND u.creditScore >= 700) " +
            "THEN 'High Limit' WHEN (u.annualIncome >= 20000 AND u.creditScore >= 600) " +
            "THEN 'Moderate Limit' ELSE 'Not Eligible' END FROM User u WHERE u.id = :userId")
    String getCreditEvaluation(Long userId);
}
