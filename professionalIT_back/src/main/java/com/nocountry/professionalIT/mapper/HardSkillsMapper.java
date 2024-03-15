package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.HardSkillsDto;
import com.nocountry.professionalIT.entities.HardSkillsEntity;
import org.mapstruct.*;

/**
 * Mapper interface for converting between HardSkillsDto and HardSkillsEntity.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-07
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface HardSkillsMapper {

    /**
     * Converts a HardSkillsDto object to a HardSkillsEntity object.
     *
     * @param hardSkillsDto The HardSkillsDto object to be converted.
     * @return The corresponding HardSkillsEntity object.
     */
    HardSkillsEntity toEntity(HardSkillsDto hardSkillsDto);

    /**
     * Converts a HardSkillsEntity object to a HardSkillsDto object.
     *
     * @param hardSkillsEntity The HardSkillsEntity object to be converted.
     * @return The corresponding HardSkillsDto object.
     */
    HardSkillsDto toDto(HardSkillsEntity hardSkillsEntity);

    /**
     * Performs a partial update from a HardSkillsDto to an existing HardSkillsEntity.
     * Only non-null properties in the HardSkillsDto will be applied to the existing HardSkillsEntity.
     *
     * @param hardSkillsDto       The HardSkillsDto containing the properties to be updated.
     * @param hardSkillsEntity    The existing HardSkillsEntity to be updated.
     * @return The updated HardSkillsEntity after applying the non-null properties from the HardSkillsDto.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    HardSkillsEntity partialUpdate(HardSkillsDto hardSkillsDto, @MappingTarget HardSkillsEntity hardSkillsEntity);
}