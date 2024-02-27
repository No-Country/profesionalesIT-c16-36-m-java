package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.CompanyEntity;
import com.nocountry.professionalIT.entities.SoftSkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Repository interface for managing operations on the {@link SoftSkillEntity} entity.
 * Extends {@link JpaRepository} to inherit basic CRUD (Create, Read, Update, Delete) operations.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-02-26
 */
public interface SoftSkillRepository extends JpaRepository<SoftSkillEntity, Integer> {
}
