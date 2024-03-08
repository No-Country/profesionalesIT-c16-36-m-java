package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.FieldDto;
import com.nocountry.professionalIT.entities.FieldEntity;
import org.mapstruct.*;

/**
 * Mapper interface for converting between FieldDto and FieldEntity.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface FieldMapper {

    /**
     * Converts a FieldDto object to a FieldEntity object.
     *
     * @param fieldDto The FieldDto object to be converted.
     * @return The corresponding FieldEntity object.
     */
    FieldEntity toEntity(FieldDto fieldDto);

    /**
     * Converts a FieldEntity object to a FieldDto object.
     *
     * @param fieldEntity The FieldEntity object to be converted.
     * @return The corresponding FieldDto object.
     */
    FieldDto toDto(FieldEntity fieldEntity);

    /**
     * Performs a partial update from a FieldDto to an existing FieldEntity.
     * Only non-null properties in the FieldDto will be applied to the existing FieldEntity.
     *
     * @param fieldDto       The FieldDto containing the properties to be updated.
     * @param fieldEntity    The existing FieldEntity to be updated.
     * @return The updated FieldEntity after applying the non-null properties from the FieldDto.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    FieldEntity partialUpdate(FieldDto fieldDto, @MappingTarget FieldEntity fieldEntity);
}