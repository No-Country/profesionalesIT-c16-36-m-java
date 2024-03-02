package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.KnownLanguageDto;
import com.nocountry.professionalIT.entities.KnowLanguageEntity;
import org.mapstruct.*;

/**
 * Mapper interface for converting between KnownLanguageDto and KnowLanguageEntity.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface KnowLanguageMapper {

    /**
     * Converts a KnownLanguageDto object to a KnowLanguageEntity object.
     *
     * @param knownLanguageDto The KnownLanguageDto object to be converted.
     * @return The corresponding KnowLanguageEntity object.
     */
    KnowLanguageEntity toEntity(KnownLanguageDto knownLanguageDto);

    /**
     * Converts a KnowLanguageEntity object to a KnownLanguageDto object.
     *
     * @param knowLanguageEntity The KnowLanguageEntity object to be converted.
     * @return The corresponding KnownLanguageDto object.
     */
    KnownLanguageDto toDto(KnowLanguageEntity knowLanguageEntity);

    /**
     * Performs a partial update from a KnownLanguageDto to an existing KnowLanguageEntity.
     * Only non-null properties in the KnownLanguageDto will be applied to the existing KnowLanguageEntity.
     *
     * @param knownLanguageDto       The KnownLanguageDto containing the properties to be updated.
     * @param knowLanguageEntity     The existing KnowLanguageEntity to be updated.
     * @return The updated KnowLanguageEntity after applying the non-null properties from the KnownLanguageDto.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    KnowLanguageEntity partialUpdate(KnownLanguageDto knownLanguageDto, @MappingTarget KnowLanguageEntity knowLanguageEntity);
}