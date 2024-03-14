package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.ProfessionalProfile;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProfessionalProfileMapper {
    ProfessionalEntity toEntity(ProfessionalProfile professionalProfile);

    @AfterMapping
    default void linkWorkModes(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getWorkModes().forEach(workMode -> workMode.setProfessional(professionalEntity));
    }

    @AfterMapping
    default void linkSoftSkills(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getSoftSkills().forEach(softSkill -> softSkill.setProfessional(professionalEntity));
    }

    @AfterMapping
    default void linkHardSkills(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getHardSkills().forEach(hardSkill -> hardSkill.setProfessional(professionalEntity));
    }

    @AfterMapping
    default void linkWorkExperiences(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getWorkExperiences().forEach(workExperience -> workExperience.setProfessional(professionalEntity));
    }
    @AfterMapping
    default void linkEducations(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getEducations().forEach(education -> education.setProfessionalEntity(professionalEntity));
    }

    @AfterMapping
    default void linkKnowLanguage(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getKnowLanguage().forEach(knowLanguage -> knowLanguage.setProfessional(professionalEntity));
    }

    ProfessionalProfile toDto(ProfessionalEntity professionalEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ProfessionalEntity partialUpdate(ProfessionalProfile professionalProfile, @MappingTarget ProfessionalEntity professionalEntity);
}