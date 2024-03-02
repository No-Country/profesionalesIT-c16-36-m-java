package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.HardSkillDto;
import com.nocountry.professionalIT.entities.HardSkillEntity;
import org.mapstruct.*;

/**
 * Mapper interface for converting between HardSkillDto and HardSkillEntity.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface HardSkillMapper {

    /**
     * Converts a HardSkillDto object to a HardSkillEntity object.
     *
     * @param hardSkillDto The HardSkillDto object to be converted.
     * @return The corresponding HardSkillEntity object.
     */
    HardSkillEntity toEntity(HardSkillDto hardSkillDto);

    /**
     * Converts a HardSkillEntity object to a HardSkillDto object.
     *
     * @param hardSkillEntity The HardSkillEntity object to be converted.
     * @return The corresponding HardSkillDto object.
     */
    HardSkillDto toDto(HardSkillEntity hardSkillEntity);

    /**
     * Performs a partial update from a HardSkillDto to an existing HardSkillEntity.
     * Only non-null properties in the HardSkillDto will be applied to the existing HardSkillEntity.
     *
     * @param hardSkillDto        The HardSkillDto containing the properties to be updated.
     * @param hardSkillEntity     The existing HardSkillEntity to be updated.
     * @return The updated HardSkillEntity after applying the non-null properties from the HardSkillDto.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    HardSkillEntity partialUpdate(HardSkillDto hardSkillDto, @MappingTarget HardSkillEntity hardSkillEntity);
}