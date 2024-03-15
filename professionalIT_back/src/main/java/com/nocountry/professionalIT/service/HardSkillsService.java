package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.HardSkillsDto;

import java.util.List;
import java.util.Optional;
/**
 * HardSkillsService is the service interface for managing hard skills.
 * This interface defines methods for retrieving, creating, updating, and deleting hard skills.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-05
 */
public interface HardSkillsService {

    /**
     * Retrieves a list of all hard skills.
     * @return a list of all hard skills.
     */
    List<HardSkillsDto> hardSkillList();

    /**
     * Retrieves a hard skill by its identifier.
     * @param id the identifier of the hard skill to retrieve.
     * @return the hard skill with the given identifier, or an empty optional if no hard skill was found.
     */
    Optional<HardSkillsDto> findById(Integer id);

    /**
     * Saves a new hard skill.
     * @param hardSkill the hard skill to save.
     * @return the saved hard skill.
     */
    HardSkillsDto save(HardSkillsDto hardSkill);

    /**
     * Updates an existing hard skill.
     * @param id the identifier of the hard skill to update.
     * @param hardSkill the updated hard skill.
     * @return the updated hard skill.
     */
    HardSkillsDto update(Integer id, HardSkillsDto hardSkill);

    /**
     * Deletes a hard skill by its identifier.
     * @param id the identifier of the hard skill to delete.
     */
    void deleteById (Integer id);

}
