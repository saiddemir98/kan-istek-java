package com.softcode.kanistek.repository;

import com.softcode.kanistek.model.entity.BloodRequests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodRequestsRepository extends JpaRepository<BloodRequests,Long> {
}
