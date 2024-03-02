package com.nocountry.professionalIT.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

/**
 * Data Transfer Object (DTO) representing information about a work mode.
 * This class is designed to transfer data related to a work mode between different layers of an application.
 *
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Data
public class WorkModeDto {

    /**
     * Unique identifier for the work mode.
     */
    private Integer id;

    /**
     * Mode associated with the work mode.
     */
    @ManyToOne
    private ModeDto mode;

    /**
     * Professional associated with the work mode. (Excluded from JSON serialization)
     */
    @JsonIgnore
    @ManyToOne
    private ProfessionalDto professional;
}
