package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.ModeDto;
import com.nocountry.professionalIT.entities.ModeEntity;
import org.mapstruct.*;

/**
 * Mapper interface for converting between ModeDto and ModeEntity.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ModeMapper {

    /**
     * Converts a ModeDto object to a ModeEntity object.
     *
     * @param modeDto The ModeDto object to be converted.
     * @return The corresponding ModeEntity object.
     */
    ModeEntity toEntity(ModeDto modeDto);

    /**
     * Converts a ModeEntity object to a ModeDto object.
     *
     * @param modeEntity The ModeEntity object to be converted.
     * @return The corresponding ModeDto object.
     */
    ModeDto toDto(ModeEntity modeEntity);

    /**
     * Performs a partial update from a ModeDto to an existing ModeEntity.
     * Only non-null properties in the ModeDto will be applied to the existing ModeEntity.
     *
     * @param modeDto           The ModeDto containing the properties to be updated.
     * @param modeEntity        The existing ModeEntity to be updated.
     * @return The updated ModeEntity after applying the non-null properties from the ModeDto.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ModeEntity partialUpdate(ModeDto modeDto, @MappingTarget ModeEntity modeEntity);
}