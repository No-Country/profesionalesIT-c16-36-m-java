package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.SkillDto;
import com.nocountry.professionalIT.entities.SkillEntity;
import org.mapstruct.*;

/**
 * Mapper interface for converting between SkillDto and SkillEntity.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SkillMapper {

    /**
     * Converts a SkillDto object to a SkillEntity object.
     *
     * @param skillDto The SkillDto object to be converted.
     * @return The corresponding SkillEntity object.
     */
    SkillEntity toEntity(SkillDto skillDto);

    /**
     * Converts a SkillEntity object to a SkillDto object.
     *
     * @param skillEntity The SkillEntity object to be converted.
     * @return The corresponding SkillDto object.
     */
    SkillDto toDto(SkillEntity skillEntity);

    /**
     * Performs a partial update from a SkillDto to an existing SkillEntity.
     * Only non-null properties in the SkillDto will be applied to the existing SkillEntity.
     *
     * @param skillDto          The SkillDto containing the properties to be updated.
     * @param skillEntity       The existing SkillEntity to be updated.
     * @return The updated SkillEntity after applying the non-null properties from the SkillDto.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SkillEntity partialUpdate(SkillDto skillDto, @MappingTarget SkillEntity skillEntity);
}