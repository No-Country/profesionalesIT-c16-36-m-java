package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.WorkModeDto;
import com.nocountry.professionalIT.entities.WorkModeEntity;
import org.mapstruct.*;

/**
 * Mapper interface for converting between WorkModeDto and WorkModeEntity.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface WorkModeMapper {

    /**
     * Converts a WorkModeDto object to a WorkModeEntity object.
     *
     * @param workModeDto The WorkModeDto object to be converted.
     * @return The corresponding WorkModeEntity object.
     */
    WorkModeEntity toEntity(WorkModeDto workModeDto);

    /**
     * Converts a WorkModeEntity object to a WorkModeDto object.
     *
     * @param workModeEntity The WorkModeEntity object to be converted.
     * @return The corresponding WorkModeDto object.
     */
    WorkModeDto toDto(WorkModeEntity workModeEntity);

    /**
     * Performs a partial update from a WorkModeDto to an existing WorkModeEntity.
     * Only non-null properties in the WorkModeDto will be applied to the existing WorkModeEntity.
     *
     * @param workModeDto           The WorkModeDto containing the properties to be updated.
     * @param workModeEntity        The existing WorkModeEntity to be updated.
     * @return The updated WorkModeEntity after applying the non-null properties from the WorkModeDto.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    WorkModeEntity partialUpdate(WorkModeDto workModeDto, @MappingTarget WorkModeEntity workModeEntity);
}