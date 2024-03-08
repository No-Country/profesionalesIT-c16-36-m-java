package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.WorkModeDto;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing work modes.
 * This interface defines methods for retrieving, creating, updating, and deleting work modes.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
public interface WorkModeService {

    /**
     * Retrieves a list of all work modes.
     *
     * @return A list of WorkModeDto objects representing work modes.
     */
    List<WorkModeDto> workModeList();

    /**
     * Retrieves a work mode by its unique identifier.
     *
     * @param id The unique identifier of the work mode.
     * @return An Optional containing the WorkModeDto if found, otherwise empty.
     */
    Optional<WorkModeDto> findById(Integer id);

    /**
     * Saves a new work mode.
     *
     * @param workMode The WorkModeDto object to be saved.
     * @return The saved WorkModeDto.
     */
    WorkModeDto save(WorkModeDto workMode);

   /**
     * Updates an existing work mode.
     *
     * @param id    The unique identifier of the work mode to be updated.
     * @param workModeDto The updated WorkModeDto object.
     * @return The updated WorkModeDto.
     */
    WorkModeDto update(Integer id, WorkModeDto workModeDto);

    /**
     * Deletes a work mode by its unique identifier.
     *
     * @param id The unique identifier of the work mode to be deleted.
     */
    void deleteById (Integer id);
}
