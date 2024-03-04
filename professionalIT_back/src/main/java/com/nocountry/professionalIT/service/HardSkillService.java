package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.HardSkillDto;
import java.util.List;
import java.util.Optional;
/**
 * Service interface for managing hard skills.
 * This interface defines methods for retrieving, creating, updating, and deleting hard skills.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
public interface HardSkillService {

    /**
     * Retrieves a list of all hard skills.
     *
     * @return A list of HardSkillDto objects representing hard skills.
     */
    List<HardSkillDto> hardSkillList();

    /**
     * Retrieves a hard skill by its unique identifier.
     *
     * @param id The unique identifier of the hard skill.
     * @return An Optional containing the HardSkillDto if found, otherwise empty.
     */
    Optional<HardSkillDto> findById(Integer id);

    /**
     * Saves a new hard skill or updates an existing one.
     *
     * @param hardSkill The HardSkillDto object to be saved or updated.
     * @return The saved or updated HardSkillDto.
     */
    HardSkillDto save(HardSkillDto hardSkill);

    /**
     * Updates an existing hard skill.
     *
     * @param id    The unique identifier of the hard skill to be updated.
     * @param hardSkill The updated HardSkillDto object.
     * @return The updated HardSkillDto.
     */
    HardSkillDto update(Integer id, HardSkillDto hardSkill);


    /**
     * Deletes a hard skill by its unique identifier.
     *
     * @param id The unique identifier of the hard skill to be deleted.
     */
    void deleteById (Integer id);

}
