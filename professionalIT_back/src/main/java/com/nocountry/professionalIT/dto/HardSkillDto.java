package com.nocountry.professionalIT.dto;


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
public class HardSkillDto {

    /**
     * Unique identifier for the hard skill.
     */
    private Integer id;

    /**
     * Name of the hard skill.
     */
    private String name;
}
