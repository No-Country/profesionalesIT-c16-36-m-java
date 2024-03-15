package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.ProfessionalProfile;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ProfessionalEntity} and its DTO {@link ProfessionalProfile}.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 *
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProfessionalProfileMapper {

    /**
     * Converts a ProfessionalProfile object to a ProfessionalEntity object.
     *
     * @param professionalProfile The ProfessionalProfile object to be converted.
     * @return The corresponding ProfessionalEntity object.
     */
    ProfessionalEntity toEntity(ProfessionalProfile professionalProfile);

    /**
     * Links each work mode to the given ProfessionalEntity after mapping.
     * @param professionalEntity The ProfessionalEntity to link work modes to.
     */
    @AfterMapping
    default void linkWorkModes(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getWorkModes().forEach(workMode -> workMode.setProfessional(professionalEntity));
    }

    /**
     * Links each soft skill to the given ProfessionalEntity after mapping.
     * @param professionalEntity The ProfessionalEntity to link soft skills to.
     */
    @AfterMapping
    default void linkSoftSkills(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getSoftSkills().forEach(softSkill -> softSkill.setProfessional(professionalEntity));
    }

    /**
     * Links each hard skill to the given ProfessionalEntity after mapping.
     * @param professionalEntity The ProfessionalEntity to link hard skills to.
     */
    @AfterMapping
    default void linkHardSkills(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getHardSkills().forEach(hardSkill -> hardSkill.setProfessional(professionalEntity));
    }

    /**
     * Links each work experience to the given ProfessionalEntity after mapping.
     * @param professionalEntity The ProfessionalEntity to link work experiences to.
     */
    @AfterMapping
    default void linkWorkExperiences(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getWorkExperiences().forEach(workExperience -> workExperience.setProfessional(professionalEntity));
    }

    /**
     * Links each education to the given ProfessionalEntity after mapping.
     * @param professionalEntity The ProfessionalEntity to link educations to.
     */
    @AfterMapping
    default void linkEducations(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getEducations().forEach(education -> education.setProfessionalEntity(professionalEntity));
    }

    /**
     * Links each known language to the given ProfessionalEntity after mapping.
     * @param professionalEntity The ProfessionalEntity to link known languages to.
     */
    @AfterMapping
    default void linkKnowLanguage(@MappingTarget ProfessionalEntity professionalEntity) {
        professionalEntity.getKnowLanguage().forEach(knowLanguage -> knowLanguage.setProfessional(professionalEntity));
    }

    /**
     * Converts a ProfessionalEntity object to a ProfessionalProfile object.
     *
     * @param professionalEntity The ProfessionalEntity object to be converted.
     * @return The corresponding ProfessionalProfile object.
     */
    ProfessionalProfile toDto(ProfessionalEntity professionalEntity);

    /**
     * Performs a partial update from a ProfessionalProfile to an existing ProfessionalEntity.
     * Only non-null properties in the ProfessionalProfile will be applied to the existing ProfessionalEntity.
     *
     * @param professionalProfile          The ProfessionalProfile containing the properties to be updated.
     * @param professionalEntity           The existing ProfessionalEntity to be updated.
     * @return The updated ProfessionalEntity after applying the non-null properties from the ProfessionalProfile.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ProfessionalEntity partialUpdate(ProfessionalProfile professionalProfile, @MappingTarget ProfessionalEntity professionalEntity);
}