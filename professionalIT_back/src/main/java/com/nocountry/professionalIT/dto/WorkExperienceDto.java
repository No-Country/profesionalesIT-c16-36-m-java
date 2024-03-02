package com.nocountry.professionalIT.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

/**
 * Data Transfer Object (DTO) representing information about work experience.
 * This class is designed to transfer data related to work experience between different layers of an application.
 *
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Data
public class WorkExperienceDto {

    /**
     * Unique identifier for the work experience.
     */
    private Integer id;

    /**
     * Status of the work experience.
     */
    private Boolean status;

    /**
     * Company associated with the work experience.
     */
    private CompanyDto company;

    /**
     * Position held during the work experience.
     */
    private String position;

    /**
     * Description of the work experience.
     */
    private String description;

    /**
     * Start date of the work experience.
     */
    private Date startDate;

    /**
     * End date of the work experience.
     */
    private Date endDate;

    /**
     * Additional details about the work experience.
     */
    private String workExperience;

    /**
     * Professional associated with the work experience. (Excluded from JSON serialization)
     */
    @JsonIgnore
    @ManyToOne
    private ProfessionalDto professional;

}

