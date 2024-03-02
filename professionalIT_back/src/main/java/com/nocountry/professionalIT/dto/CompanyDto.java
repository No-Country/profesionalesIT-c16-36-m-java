package com.nocountry.professionalIT.dto;

import lombok.Data;
/**
 * Data Transfer Object (DTO) representing information about a company.
 * This class is designed to transfer data related to a company between different layers of an application.
 *
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Data
public class CompanyDto {

    /**
     * Unique identifier for the company.
     */
    private Integer id;

    /**
     * Name of the company.
     */
    private String name;

}
