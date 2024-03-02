package com.nocountry.professionalIT.dto;


import jakarta.persistence.ManyToOne;
import lombok.Data;

/**
 * Data Transfer Object (DTO) representing information about a skill.
 * This class is designed to transfer data related to a skill between different layers of an application.
 *
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Data
public class SkillDto {

    /**
     * Unique identifier for the skill.
     */
    private Integer id;

    /**
     * Soft skill associated with the skill.
     */
    @ManyToOne
    private SoftSkillDto softSkill;

    /**
     * Hard skill associated with the skill.
     */
    @ManyToOne
    private HardSkillDto hardSkill;
}
