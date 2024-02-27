package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.FieldEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldRepository extends JpaRepository<FieldEntity,Integer> {
}
