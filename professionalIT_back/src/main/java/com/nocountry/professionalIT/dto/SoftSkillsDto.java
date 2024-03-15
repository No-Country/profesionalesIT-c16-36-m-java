package com.nocountry.professionalIT.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nocountry.professionalIT.entities.SSEntity;
import jakarta.persistence.*;

/**
 * Data Transfer Object (DTO) representing information about soft skills.
 * This class is designed to transfer data related to soft skills between different layers of an application.
 *
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
public class SoftSkillsDto {

    /**
     * Unique identifier for the soft skill.
     */
    private Integer id;


    /**
     * Soft skill associated with the soft skill set.
     */
    @ManyToOne
    @JsonIgnore
    private SSEntity ss;

    /**
     * Professional associated with the soft skill. (Excluded from JSON serialization)
     */
    @ManyToOne
    @JsonIgnore
    private ProfessionalEntityDto professional;
}
