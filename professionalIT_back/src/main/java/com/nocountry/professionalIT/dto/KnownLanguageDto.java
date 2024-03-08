package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.enums.LanguageLevel;
import jakarta.persistence.ManyToOne;
import lombok.Data;
/**
 * Data Transfer Object (DTO) representing information about a known language with proficiency level.
 * This class is designed to transfer data related to a known language between different layers of an application.
 *
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Data
public class KnownLanguageDto {

    /**
     * Unique identifier for the known language.
     */
    private Integer id;

    /**
     * Language associated with the known language.
     */
    @ManyToOne
    private LanguageDto language;

    /**
     * Proficiency level of the known language.
     */
    private LanguageLevel level;

}
