package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.SoftSkillDto;
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
public interface SoftSkillService {

    /**
     * Retrieves a list of all skills.
     *
     * @return A list of SkillDto objects representing skills.
     */
    List<SoftSkillDto> softSkillList();

    /**
     * Retrieves a skill by its unique identifier.
     *
     * @param id The unique identifier of the skill.
     * @return An Optional containing the SkillDto if found, otherwise empty.
     */
    Optional<SoftSkillDto> findById(Integer id);


    /**
     * Saves a new skill.
     *
     * @param softSkill The SkillDto object to be saved.
     * @return The saved SkillDto.
     */
    SoftSkillDto save(SoftSkillDto softSkill);

    /**
     * Updates an existing skill.
     *
     * @param id    The unique identifier of the skill to be updated.
     * @param softSkill The updated SkillDto object.
     * @return The updated SkillDto.
     */
    SoftSkillDto update(Integer id, SoftSkillDto softSkill);

    /**
     * Deletes a skill by its unique identifier.
     *
     * @param id The unique identifier of the skill to be deleted.
     */
    void deleteById (Integer id);

}
