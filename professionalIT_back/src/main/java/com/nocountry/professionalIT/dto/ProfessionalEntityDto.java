package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.dto.users.NewPerson;
import com.nocountry.professionalIT.dto.users.NewUser;
import com.nocountry.professionalIT.entities.*;
import com.nocountry.professionalIT.enums.Seniority;
import jakarta.validation.Valid;
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

    Boolean availInmediate;

    Boolean availTravel;

    List<SoftSkillsEntity> softSkills;

    List<HardSkillsEntity> hardSkills;

    @Valid
    NewPerson person;

    NewUser user;

    FieldEntity field;

    Seniority seniority;

    List<WorkExperienceEntity> workExperiences;

    List<KnowLanguageEntity> knowLanguage;

    LocalDateTime updatedDate;

    LocalDateTime createdDate;
}