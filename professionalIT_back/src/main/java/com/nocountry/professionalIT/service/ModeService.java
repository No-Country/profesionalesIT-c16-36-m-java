package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.ModeDto;

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
public interface ModeService {

    /**
     * Retrieves a list of all work modes.
     *
     * @return A list of ModeDto objects representing work modes.
     */
    List<ModeDto> modeList();

    /**
     * Retrieves a work mode by its unique identifier.
     *
     * @param id The unique identifier of the work mode.
     * @return An Optional containing the ModeDto if found, otherwise empty.
     */
    Optional<ModeDto> findById(Integer id);

    /**
     * Saves a new work mode.
     *
     * @param mode The ModeDto object to be saved.
     * @return The saved ModeDto.
     */
    ModeDto save(ModeDto mode);

    /**
     * Updates an existing work mode.
     *
     * @param id    The unique identifier of the work mode to be updated.
     * @param mode The updated ModeDto object.
     * @return The updated ModeDto.
     */
    ModeDto update(Integer id, ModeDto mode);

    /**
     * Deletes a work mode by its unique identifier.
     *
     * @param id The unique identifier of the work mode to be deleted.
     */
    void deleteById (Integer id);
}

