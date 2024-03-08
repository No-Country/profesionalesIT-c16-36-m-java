package com.nocountry.professionalIT.dto;


import lombok.Data;

/**
 * Data Transfer Object (DTO) representing information about a mode.
 * This class is designed to transfer data related to a mode between different layers of an application.
 *
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Data
public class ModeDto {

    /**
     * Unique identifier for the mode.
     */
    private Integer id;

    /**
     * Name of the mode.
     */
    private String name;
}
