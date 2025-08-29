package com.example.dangdangdang.repository;

import com.example.dangdangdang.model.PoliticianEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliticianRepository extends JpaRepository<PoliticianEntity,Long> {
}
