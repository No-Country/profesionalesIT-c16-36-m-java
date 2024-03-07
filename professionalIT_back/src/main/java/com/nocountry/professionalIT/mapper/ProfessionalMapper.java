package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.ProfessionalEntityDto;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProfessionalMapper {
    ProfessionalEntity toEntity(ProfessionalEntityDto professionalEntityDto);

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
    default void linkKnowLanguage(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getKnowLanguage().forEach(knowLanguage -> knowLanguage.setProfessional(professionalEntity));
    }

    ProfessionalEntityDto toDto(ProfessionalEntity professionalEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ProfessionalEntity partialUpdate(ProfessionalEntityDto professionalEntityDto, @MappingTarget ProfessionalEntity professionalEntity);
}