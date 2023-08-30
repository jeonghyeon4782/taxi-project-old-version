package com.wjd4782.taxiprojectrestapi.repository;

import com.wjd4782.taxiprojectrestapi.domain.Belong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BelongRepository extends JpaRepository<Belong, Long> {
}
