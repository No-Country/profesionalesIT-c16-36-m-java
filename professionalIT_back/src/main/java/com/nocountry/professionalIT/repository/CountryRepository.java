package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for performing CRUD operations on CountryEntity objects.
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-24
 * */
@Repository
public interface CountryRepository extends JpaRepository<CountryEntity,String> {
}
