package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.SkillDto;
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
public interface SkillService {

    /**
     * Retrieves a list of all skills.
     *
     * @return A list of SkillDto objects representing skills.
     */
    List<SkillDto> skillList();

    /**
     * Retrieves a skill by its unique identifier.
     *
     * @param id The unique identifier of the skill.
     * @return An Optional containing the SkillDto if found, otherwise empty.
     */
    Optional<SkillDto> findById(Integer id);

    /**
     * Saves a new skill.
     *
     * @param skill The SkillDto object to be saved.
     * @return The saved SkillDto.
     */
    SkillDto save(SkillDto skill);

    /**
     * Updates an existing skill.
     *
     * @param id    The unique identifier of the skill to be updated.
     * @param skill The updated SkillDto object.
     * @return The updated SkillDto.
     */
    SkillDto update(Integer id, SkillDto skill);

    /**
     * Deletes a skill by its unique identifier.
     *
     * @param id The unique identifier of the skill to be deleted.
     */
    void deleteById (Integer id);
}
