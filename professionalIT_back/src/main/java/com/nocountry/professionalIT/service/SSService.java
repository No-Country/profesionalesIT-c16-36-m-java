package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.SSDto;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing skills.
 * This interface defines methods for retrieving, creating, updating, and deleting skills.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-05
 */
public interface SSService {
    /**
     * Retrieves a list of all skills.
     * @return a list of all skills.
     */
    List<SSDto> skillList();

    /**
     * Retrieves a skill by its identifier.
     * @param id the identifier of the skill to retrieve.
     * @return the skill with the given identifier, or an empty optional if no skill was found.
     */
    Optional<SSDto> findById(Integer id);

    /**
     * Saves a new skill.
     * @param skill the skill to save.
     * @return the saved skill.
     */
    SSDto save(SSDto skill);

    /**
     * Updates an existing skill.
     * @param id the identifier of the skill to update.
     * @param skill the updated skill.
     * @return the updated skill.
     */
    SSDto update(Integer id, SSDto skill);

    /**
     * Deletes a skill by its identifier.
     * @param id the identifier of the skill to delete.
     */
    void deleteById (Integer id);
}
