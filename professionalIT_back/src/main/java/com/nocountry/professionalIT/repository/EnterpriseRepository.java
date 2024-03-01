package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.EnterpriseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnterpriseRepository extends JpaRepository<EnterpriseEntity,Integer> {

  List<EnterpriseEntity> findByNameContainingIgnoreCase (String search);
}
