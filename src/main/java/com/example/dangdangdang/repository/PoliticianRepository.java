package com.example.dangdangdang.repository;

import com.example.dangdangdang.model.PoliticalPartyEntity;
import com.example.dangdangdang.model.PoliticianEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PoliticianRepository extends JpaRepository<PoliticianEntity,Long> {

   Optional<PoliticianEntity> findByPoliticianNameContaining(String politicianName);
   Optional<PoliticalPartyEntity> findByPoliticalPartyContaining(String politicalName);
}
