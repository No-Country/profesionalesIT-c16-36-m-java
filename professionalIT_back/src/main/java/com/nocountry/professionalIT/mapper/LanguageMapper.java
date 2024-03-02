package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.LanguageDto;
import com.nocountry.professionalIT.entities.LanguageEntity;
import org.mapstruct.*;

/**
 * Mapper interface for converting between LanguageDto and LanguageEntity.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 *
 * @author Claudia Ortz
 * @version 1.0
 * @since 2024-03-01
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface LanguageMapper {

    /**
     * Converts a LanguageDto object to a LanguageEntity object.
     *
     * @param languageDto The LanguageDto object to be converted.
     * @return The corresponding LanguageEntity object.
     */
    LanguageEntity toEntity(LanguageDto languageDto);

    /**
     * Converts a LanguageEntity object to a LanguageDto object.
     *
     * @param languageEntity The LanguageEntity object to be converted.
     * @return The corresponding LanguageDto object.
     */
    LanguageDto toDto(LanguageEntity languageEntity);

    /**
     * Performs a partial update from a LanguageDto to an existing LanguageEntity.
     * Only non-null properties in the LanguageDto will be applied to the existing LanguageEntity.
     *
     * @param languageDto           The LanguageDto containing the properties to be updated.
     * @param languageEntity        The existing LanguageEntity to be updated.
     * @return The updated LanguageEntity after applying the non-null properties from the LanguageDto.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    LanguageEntity partialUpdate(LanguageDto languageDto, @MappingTarget LanguageEntity languageEntity);
}