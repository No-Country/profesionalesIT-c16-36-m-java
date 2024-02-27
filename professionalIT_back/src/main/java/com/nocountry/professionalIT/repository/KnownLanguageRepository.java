package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.KnowLanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KnownLanguageRepository extends JpaRepository<KnowLanguageEntity, Integer> {
}
