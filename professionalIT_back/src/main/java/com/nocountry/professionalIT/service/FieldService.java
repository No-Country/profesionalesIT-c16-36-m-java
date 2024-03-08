package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.FieldDto;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing fields.
 * This interface defines methods for retrieving, creating, updating, and deleting fields.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
public  interface FieldService {

    /**
     * Retrieves a list of all fields.
     *
     * @return A list of FieldDto objects representing fields.
     */
    List<FieldDto> fieldList();

    /**
     * Retrieves a field by its unique identifier.
     *
     * @param id The unique identifier of the field.
     * @return An Optional containing the FieldDto if found, otherwise empty.
     */
    Optional<FieldDto> findById(Integer id);

    /**
     * Saves a new field or updates an existing one.
     *
     * @param field The FieldDto object to be saved or updated.
     * @return The saved or updated FieldDto.
     */
    FieldDto save(FieldDto field);

    /**
     * Updates an existing field.
     *
     * @param id    The unique identifier of the field to be updated.
     * @param field The updated FieldDto object.
     * @return The updated FieldDto.
     */
    FieldDto update(Integer id, FieldDto field);

    /**
     * Deletes a field by its unique identifier.
     *
     * @param id The unique identifier of the field to be deleted.
     */
    void deleteById (Integer id);

}
