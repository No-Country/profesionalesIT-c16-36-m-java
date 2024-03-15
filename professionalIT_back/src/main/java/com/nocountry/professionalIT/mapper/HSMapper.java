package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.HSDto;
import com.nocountry.professionalIT.entities.HSEntity;
import org.mapstruct.*;

/**
 * Mapper interface for converting between HSDto and HSEntity.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-07
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface HSMapper {

    /**
     * Converts a HSDto object to a HSEntity object.
     *
     * @param HSDto The HSDto object to be converted.
     * @return The corresponding HSEntity object.
     */
    HSEntity toEntity(HSDto HSDto);

    /**
     * Converts a HSEntity object to a HSDto object.
     *
     * @param HSEntity The HSEntity object to be converted.
     * @return The corresponding HSDto object.
     */
    HSDto toDto(HSEntity HSEntity);

    /**
     * Performs a partial update from a HSDto to an existing HSEntity.
     * Only non-null properties in the HSDto will be applied to the existing HSEntity.
     *
     * @param HSDto       The HSDto containing the properties to be updated.
     * @param HSEntity    The existing HSEntity to be updated.
     * @return The updated HSEntity after applying the non-null properties from the HSDto.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    HSEntity partialUpdate(HSDto HSDto, @MappingTarget HSEntity HSEntity);
}