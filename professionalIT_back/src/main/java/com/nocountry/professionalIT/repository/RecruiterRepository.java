package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.RecruiterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Repository interface for performing CRUD operations on RecruiterEntity objects.
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-29
 * */
@Repository
public interface RecruiterRepository extends JpaRepository<RecruiterEntity, UUID> {
}
