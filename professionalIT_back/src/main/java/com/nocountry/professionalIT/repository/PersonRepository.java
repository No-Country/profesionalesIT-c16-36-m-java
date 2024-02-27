package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Repository interface for performing CRUD operations on PersonEntity objects.
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-24
 * */
@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, UUID> {
}
