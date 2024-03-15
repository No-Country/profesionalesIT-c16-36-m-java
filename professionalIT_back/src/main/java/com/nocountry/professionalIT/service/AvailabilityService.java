package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.AvailabilityDto;
import java.util.List;
import java.util.Optional;
/**
 * Service interface for managing availabilitoes.
 * This interface defines methods for retrieving, creating, updating, and deleting avalabilities.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
public interface AvailabilityService {

    /**
     * Retrieves a list of all availabilities.
     * @return A list of AvailabilityDto objects representing availabilities.
     */
    List<AvailabilityDto> availabilityList();

    /**
     * Retrieves an availability by its unique identifier.
     * @param id The unique identifier of the availability.
     * @return An Optional containing the AvailabilityDto if found, otherwise empty.
     */


    Optional <AvailabilityDto> findById(Integer id);

    /**
     * Saves a new availability.
     * @param availability The AvailabilityDto object to be saved.
     * @return The saved AvailabilityDto.
     */

    AvailabilityDto save(AvailabilityDto availability);

    /**
     * Updates an existing availability.
     * @param id    The unique identifier of the availability to be updated.
     * @param availability The updated AvailabilityDto object.
     * @return The updated AvailabilityDto.
     */

    AvailabilityDto update(Integer id, AvailabilityDto availability);

    /**Deletes an availability by its unique identifier.
     * @param id The unique identifier of the availability to be deleted.
     *
     */
    void deleteById (Integer id);
}
