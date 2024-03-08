package com.nocountry.professionalIT.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.ManyToOne;
import lombok.Data;

/**
 * Data Transfer Object (DTO) representing information about a hard skill.
 * This class is designed to transfer data related to a hard skill between different layers of an application.
 *
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */

@Data
public class HardSkillsDto {

    /**
     * Unique identifier for the hard skill.
     */
    private Integer id;
    @ManyToOne
    @JsonIgnore
    private HSDto hs;

    @ManyToOne
    @JsonIgnore
    private ProfessionalEntityDto professional;
}
