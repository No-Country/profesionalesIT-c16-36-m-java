package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.*;
import com.nocountry.professionalIT.enums.Seniority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

/**
 * Repository for accessing and managing ProfessionalEntity objects in the database.
 * This repository provides methods for CRUD operations and custom queries related to professionals.
 * @author Gonzalo Delgado
 * @email: gonzadelgado.geo@gmail.com
 * @version 1.0
 * @since 2024-02-28
 */
@Repository
public interface ProfessionalRepository extends JpaRepository<ProfessionalEntity, UUID> , JpaSpecificationExecutor<ProfessionalEntity> {

    /**
     * Retrieves a professional by their unique identifier.
     * @param id The unique identifier of the professional.
     * @return The professional entity if found, null otherwise.
     */
    @Query("SELECT p FROM ProfessionalEntity p WHERE p.id = :id")
    ProfessionalEntity findProfessionalById(UUID id);

    /**
     * Retrieves professionals by skill name.
     * @param skillName The name of the skill to search for.
     * @return A list of professionals who possess the specified skill.
     */
    @Query("SELECT DISTINCT p FROM ProfessionalEntity p JOIN p.skillList s WHERE s.softSkill.name = ?1 OR s.hardSkill.name = ?1")
    List<ProfessionalEntity> findBySkillName(String skillName);

    /**
     * Retrieves professionals by their seniority level.
     * @param seniority The seniority level of the professionals.
     * @return A list of professionals with the specified seniority level.
     */
    List<ProfessionalEntity> findBySeniority(Seniority seniority);

    /**
     * Retrieves professionals by field entity.
     * @param fieldEntity The field entity to search for.
     * @return A list of professionals associated with the specified field entity.
     */
    List<ProfessionalEntity> findByFieldId(FieldEntity fieldEntity);


}

