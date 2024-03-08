package com.nocountry.professionalIT.dto;

import lombok.Data;
/**
 * Data Transfer Object (DTO) representing information about a language.
 * This class is designed to transfer data related to a language between different layers of an application.
 *
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Data
public class LanguageDto {

    /**
     * Unique identifier for the language.
     */
    private Integer id;

    /**
     * Name of the language.
     */
    private String name;
}
