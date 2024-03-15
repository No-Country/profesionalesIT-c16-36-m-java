package com.nocountry.professionalIT.dto;


import lombok.Data;

/**
 * This class represents a Data Transfer Object (DTO) for HS entities.
 * This class is designed to transfer data related to a HS between different layers of an application.
 * @author Claudia Ortiz
 *@version 1.0
 * @since 2024-02-24
 * */
@Data
public class HSDto {

    /**
     * The unique identifier of the HS
     */
    private Integer id;

    /**
     * The name of the HS
     */
    private String name;

}
