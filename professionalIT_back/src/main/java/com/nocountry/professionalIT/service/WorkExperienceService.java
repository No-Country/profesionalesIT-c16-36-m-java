package com.nocountry.professionalIT.service;


import com.nocountry.professionalIT.dto.WorkExperienceDto;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing work experiences.
 * This interface defines methods for retrieving, creating, updating, and deleting work experiences.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
public interface WorkExperienceService {

    /**
     * Retrieves a list of all work experiences.
     *
     * @return A list of WorkExperienceDto objects representing work experiences.
     */
    List<WorkExperienceDto> workExperienceList();

    /**
     * Retrieves a work experience by its unique identifier.
     *
     * @param id The unique identifier of the work experience.
     * @return An Optional containing the WorkExperienceDto if found, otherwise empty.
     */
    Optional<WorkExperienceDto> findById(Integer id);


    /**
     * Saves a new work experience.
     *
     * @param workExperience The WorkExperienceDto object to be saved.
     * @return The saved WorkExperienceDto.
     */
    WorkExperienceDto save(WorkExperienceDto workExperience);

    /**
     * Updates an existing work experience.
     *
     * @param id    The unique identifier of the work experience to be updated.
     * @param workExperienceDto The updated WorkExperienceDto object.
     * @return The updated WorkExperienceDto.
     */
    WorkExperienceDto update(Integer id, WorkExperienceDto workExperienceDto);

    /**
     * Deletes a work experience by its unique identifier.
     *
     * @param id The unique identifier of the work experience to be deleted.
     */
    void deleteById (Integer id);
}
