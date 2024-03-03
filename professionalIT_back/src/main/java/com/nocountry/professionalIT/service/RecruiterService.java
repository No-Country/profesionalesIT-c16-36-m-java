package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.PersonDTO;
import com.nocountry.professionalIT.dto.UserDTO;
import com.nocountry.professionalIT.entities.RecruiterEntity;

import java.util.List;
import java.util.UUID;

/**
 * Service interface for managing RecruiterEntity
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-29
 * */
public interface RecruiterService {

    /**
     * Saves a new recruiter based on the provided person and user data.
     *
     * @param personDTO The DTO containing the person data for the new recruiter.
     * @param userDTO The DTO containing the user data for the new recruiter.
     * @return The newly created recruiter entity.
     */
    RecruiterEntity saveNewRecruiter(PersonDTO personDTO, UserDTO userDTO);

    /**
     * Finds a recruiter by its ID.
     *
     * @param id The ID of the recruiter to find.
     * @return The recruiter entity with the specified ID.
     */
    RecruiterEntity findById (UUID id);

    /**
     * Retrieves all recruiters.
     *
     * @return A list of all recruiters.
     */
    List<RecruiterEntity> findAll ();
}
