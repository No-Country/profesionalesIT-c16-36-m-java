package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.entities.*;
import com.nocountry.professionalIT.enums.Seniority;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * DTO for {@link com.nocountry.professionalIT.entities.ProfessionalEntity}
 */
@Value
public class ProfessionalEntityDto implements Serializable {
    
    UUID id;

    String portfolio;

    List<WorkModeEntity> workModes;

    AvailabilityEntity availabilities;

    @NotNull
    Boolean availInmediate;

    @NotNull
    Boolean availTravel;

    List<SoftSkillsEntity> softSkills;

    List<HardSkillsEntity> hardSkills;

    PersonEntity person;

    FieldEntity field;

    @NotNull
    Seniority seniority;

    List<WorkExperienceEntity> workExperiences;

    List<KnowLanguageEntity> knowLanguage;

    LocalDateTime updatedDate;

    LocalDateTime createdDate;
}