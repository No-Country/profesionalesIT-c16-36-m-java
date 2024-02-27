package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.LanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<LanguageEntity, Integer> {
}
