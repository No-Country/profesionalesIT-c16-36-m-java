package com.nocountry.professionalIT.dto;

import lombok.Data;

/**
 * Data Transfer Object (DTO) representing information about a soft skill.
 * This class is designed to transfer data related to a soft skill between different layers of an application.
 *
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Data
public class SSDto {

    /**
     * Unique identifier for the soft skill.
     */
    private Integer id;

    /**
     * Name of the soft skill.
     */
    private String name;
}
