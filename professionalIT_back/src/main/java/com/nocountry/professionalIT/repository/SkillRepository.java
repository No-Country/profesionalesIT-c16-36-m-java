package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.SkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<SkillEntity, Integer> {
}
