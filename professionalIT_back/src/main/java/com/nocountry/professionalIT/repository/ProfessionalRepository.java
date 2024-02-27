package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.ProfessionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfessionalRepository extends JpaRepository<ProfessionalEntity, UUID> {



}
