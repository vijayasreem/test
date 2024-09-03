
package com.test.repo.com.repo;

import com.test.repo.com.entity.LoanOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanOfferRepository extends JpaRepository<LoanOffer, Long> {
    // Additional query methods can be defined here if needed
}
