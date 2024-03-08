package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.LanguageDto;
import java.util.List;
import java.util.Optional;
/**
 * Service interface for managing languages.
 * This interface defines methods for retrieving, creating, updating, and deleting languages.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
public interface LanguageService {

    /**
     * Retrieves a list of all languages.
     *
     * @return A list of LanguageDto objects representing languages.
     */
    List<LanguageDto> languagesList();

    /**
     * Retrieves a language by its unique identifier.
     *
     * @param id The unique identifier of the language.
     * @return An Optional containing the LanguageDto if found, otherwise empty.
     */
    Optional<LanguageDto> findById(Integer id);

    /**
     * Saves a new language.
     *
     * @param language The LanguageDto object to be saved.
     * @return The saved LanguageDto.
     */
    LanguageDto save(LanguageDto language);

    /**
     * Updates an existing language.
     *
     * @param id    The unique identifier of the language to be updated.
     * @param language The updated LanguageDto object.
     * @return The updated LanguageDto.
     */
    LanguageDto update(Integer id, LanguageDto language);

    /**
     * Deletes a language by its unique identifier.
     *
     * @param id The unique identifier of the language to be deleted.
     */
    void deleteById (Integer id);
}
