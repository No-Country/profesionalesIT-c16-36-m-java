package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.AvailabilityDto;
import com.nocountry.professionalIT.entities.AvailabilityEntity;
import org.mapstruct.*;


/**
 * Mapper for the entity {@link AvailabilityEntity} and its DTO {@link AvailabilityDto}.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 * @version 1.0
 * @since 2024-03-07
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AvailabilityMapper {

        /**
         * Converts a AvailabilityDto object to a AvailabilityEntity object.
         *
         * @param availabilityDto The AvailabilityDto object to be converted.
         * @return The corresponding AvailabilityEntity object.
         */
        AvailabilityEntity toEntity(AvailabilityDto availabilityDto);

        /**
         * Converts a AvailabilityEntity object to a AvailabilityDto object.
         *
         * @param availabilityEntity The AvailabilityEntity object to be converted.
         * @return The corresponding AvailabilityDto object.
         */
        AvailabilityDto toDto(AvailabilityEntity availabilityEntity);

        /**
         * Performs a partial update from a AvailabilityDto to an existing AvailabilityEntity.
         * Only non-null properties in the AvailabilityDto will be applied to the existing AvailabilityEntity.
         *
         * @param availabilityDto       The AvailabilityDto containing the properties to be updated.
         * @param availabilityEntity    The existing AvailabilityEntity to be updated.
         * @return The updated AvailabilityEntity after applying the non-null properties from the AvailabilityDto.
         */
        @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
        AvailabilityEntity partialUpdate(AvailabilityDto availabilityDto, @MappingTarget AvailabilityEntity availabilityEntity);

}
