package com.nocountry.professionalIT.dto;


import lombok.Data;

/**
 * Data Transfer Object (DTO) representing information about an availability.
 * This class is designed to transfer data related to an availability between different layers of an application.
 *
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Data
public class AvailabilityDto {

    /**
     * Unique identifier for the availability.
     */
    private Integer Id;

    /**
     * Start time of the availability.
     */
    private String startTime;

    /**
     * End time of the availability.
     */
    private String endTime;

}
