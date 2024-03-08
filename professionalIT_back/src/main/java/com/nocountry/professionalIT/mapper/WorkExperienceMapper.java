package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.WorkExperienceDto;
import com.nocountry.professionalIT.entities.WorkExperienceEntity;
import org.mapstruct.*;

/**
 * Mapper interface for converting between WorkExperienceDto and WorkExperienceEntity.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since [Date of Creation]
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface WorkExperienceMapper {

    /**
     * Converts a WorkExperienceDto object to a WorkExperienceEntity object.
     *
     * @param workExperienceDto The WorkExperienceDto object to be converted.
     * @return The corresponding WorkExperienceEntity object.
     */
    WorkExperienceEntity toEntity(WorkExperienceDto workExperienceDto);

    /**
     * Converts a WorkExperienceEntity object to a WorkExperienceDto object.
     *
     * @param workExperienceEntity The WorkExperienceEntity object to be converted.
     * @return The corresponding WorkExperienceDto object.
     */
    WorkExperienceDto toDto(WorkExperienceEntity workExperienceEntity);

    /**
     * Performs a partial update from a WorkExperienceDto to an existing WorkExperienceEntity.
     * Only non-null properties in the WorkExperienceDto will be applied to the existing WorkExperienceEntity.
     *
     * @param workExperienceDto         The WorkExperienceDto containing the properties to be updated.
     * @param workExperienceEntity      The existing WorkExperienceEntity to be updated.
     * @return The updated WorkExperienceEntity after applying the non-null properties from the WorkExperienceDto.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    WorkExperienceEntity partialUpdate(WorkExperienceDto workExperienceDto, @MappingTarget WorkExperienceEntity workExperienceEntity);
}