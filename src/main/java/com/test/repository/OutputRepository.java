package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Output;

@Repository
public interface OutputRepository extends JpaRepository<Output, Long> {
    Output findByEndorsementNumber(String endorsementNumber);
}