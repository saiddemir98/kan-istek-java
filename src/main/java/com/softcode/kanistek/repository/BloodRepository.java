package com.softcode.kanistek.repository;

import com.softcode.kanistek.model.entity.Blood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodRepository extends JpaRepository<Blood,Long> {
}
