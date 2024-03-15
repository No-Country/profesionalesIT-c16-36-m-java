package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.SoftSkillsDto;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing soft skills.
 * This interface defines methods for retrieving, creating, updating, and deleting soft skills.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-05
 */
public interface SoftSkillService {

    /**
     * Retrieves a list of all soft skills.
     * @return a list of all soft skills.
     */
    List<SoftSkillsDto> softSkillList();

    /**
     * Retrieves a soft skill by its identifier.
     * @param id the identifier of the soft skill to retrieve.
     * @return the soft skill with the given identifier, or an empty optional if no soft skill was found.
     */
    Optional<SoftSkillsDto> findById(Integer id);

    /**
     * Saves a new soft skill.
     * @param softSkill the soft skill to save.
     * @return the saved soft skill.
     */
    SoftSkillsDto save(SoftSkillsDto softSkill);

    /**
     * Updates an existing soft skill.
     * @param id the identifier of the soft skill to update.
     * @param softSkill the updated soft skill.
     * @return the updated soft skill.
     */
    SoftSkillsDto update(Integer id, SoftSkillsDto softSkill);

    /**
     * Deletes a soft skill by its identifier.
     * @param id the identifier of the soft skill to delete.
     */
    void deleteById (Integer id);

}
