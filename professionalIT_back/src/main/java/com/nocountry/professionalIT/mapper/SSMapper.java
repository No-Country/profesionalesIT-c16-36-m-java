package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.SSDto;
import com.nocountry.professionalIT.entities.SSEntity;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link SSEntity} and its DTO {@link SSDto}.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 *
 */

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SSMapper {

    /**
     * Converts a SSDto object to a SSEntity object.
     *
     * @param ssDto The SSDto object to be converted.
     * @return The corresponding SSEntity object.
     */
    SSEntity toEntity(SSDto ssDto);

    /**
     * Converts a SSEntity object to a SSDto object.
     *
     * @param ssEntity The SSEntity object to be converted.
     * @return The corresponding SSDto object.
     */
    SSDto toDto(SSEntity ssEntity);


    /**
     * Performs a partial update from a SSDto to an existing SSEntity.
     * @param ssDto The SSDto object containing the updated fields.
     * @param ssEntity The existing SSEntity object to be updated.
     * @return The updated SSEntity object.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SSEntity partialUpdate(SSDto ssDto, @MappingTarget SSEntity ssEntity);
}