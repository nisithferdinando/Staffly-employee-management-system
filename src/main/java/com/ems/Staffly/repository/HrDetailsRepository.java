package com.ems.Staffly.repository;

import com.ems.Staffly.entity.HrDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HrDetailsRepository extends JpaRepository<HrDetails, Long> {
    Optional<HrDetails> findByHrEmail(String hrEmail);
}
