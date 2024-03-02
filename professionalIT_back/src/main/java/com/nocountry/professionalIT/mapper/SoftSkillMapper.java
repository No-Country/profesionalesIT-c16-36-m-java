package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.SoftSkillDto;
import com.nocountry.professionalIT.entities.SoftSkillEntity;
import org.mapstruct.*;
/**
 * Mapper interface for converting between SoftSkillDto and SoftSkillEntity.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SoftSkillMapper {

    /**
     * Converts a SoftSkillDto object to a SoftSkillEntity object.
     *
     * @param softSkillDto The SoftSkillDto object to be converted.
     * @return The corresponding SoftSkillEntity object.
     */
    SoftSkillEntity toEntity(SoftSkillDto softSkillDto);

    /**
     * Converts a SoftSkillEntity object to a SoftSkillDto object.
     *
     * @param softSkillEntity The SoftSkillEntity object to be converted.
     * @return The corresponding SoftSkillDto object.
     */
    SoftSkillDto toDto(SoftSkillEntity softSkillEntity);

    /**
     * Performs a partial update from a SoftSkillDto to an existing SoftSkillEntity.
     * Only non-null properties in the SoftSkillDto will be applied to the existing SoftSkillEntity.
     *
     * @param softSkillDto          The SoftSkillDto containing the properties to be updated.
     * @param softSkillEntity       The existing SoftSkillEntity to be updated.
     * @return The updated SoftSkillEntity after applying the non-null properties from the SoftSkillDto.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SoftSkillEntity partialUpdate(SoftSkillDto softSkillDto, @MappingTarget SoftSkillEntity softSkillEntity);
}