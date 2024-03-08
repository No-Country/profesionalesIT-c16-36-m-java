package com.nocountry.professionalIT.dto;


import lombok.Data;
/**
 * Data Transfer Object (DTO) representing information about a field.
 * This class is designed to transfer data related to a field between different layers of an application.
 *
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Data
public class FieldDto {

    /**
     * Unique identifier for the field.
     */
    private Integer id;

    /**
     * Name of the field.
     */
    private String name;
}
