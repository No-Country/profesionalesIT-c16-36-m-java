package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.AvailabilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing operations on the {@link AvailabilityEntity} entity.
 * Extends {@link JpaRepository} to inherit basic CRUD (Create, Read, Update, Delete) operations.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-02-26
 */
@Repository
public interface AvailabilityRepository extends JpaRepository<AvailabilityEntity,Integer> {
}
