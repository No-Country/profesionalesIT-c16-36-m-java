package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.WorkExperienceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkExperienceRepository extends JpaRepository<WorkExperienceEntity, Integer> {
}
