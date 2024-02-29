package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.RecruiterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RecruiterRepository extends JpaRepository<RecruiterEntity, UUID> {
}
