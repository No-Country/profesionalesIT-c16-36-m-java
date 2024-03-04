package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.KnownLanguageDto;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing known languages.
 * This interface defines methods for retrieving, creating, updating, and deleting known languages.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
public interface KnownLanguageService {

    /**
     * Retrieves a list of all known languages.
     *
     * @return A list of KnownLanguageDto objects representing known languages.
     */
    List<KnownLanguageDto> KnownLanguageList();

    /**
     * Retrieves a known language by its unique identifier.
     *
     * @param id The unique identifier of the known language.
     * @return An Optional containing the KnownLanguageDto if found, otherwise empty.
     */
    Optional<KnownLanguageDto> findById(Integer id);


    /**
     * Saves a new known language or updates an existing one.
     *
     * @param knownLanguage The KnownLanguageDto object to be saved or updated.
     * @return The saved or updated KnownLanguageDto.
     */
    KnownLanguageDto save(KnownLanguageDto knownLanguage);

    /**
     * Updates an existing known language.
     * @param id        Unique identifier of the entity.
     * @param knownLanguageDto The KnownLanguageDto object to be updated.
     * @return          The updated KnownLanguageEntity entity or null if the entity was not found.
     */
    KnownLanguageDto update(Integer id, KnownLanguageDto knownLanguageDto);

    /**
     * Deletes a known language by its unique identifier.
     *
     * @param id The unique identifier of the known language to be deleted.
     */
    void deleteById (Integer id);
}
