package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.CompanyDto;
import com.nocountry.professionalIT.entities.CompanyEntity;
import org.mapstruct.*;

/**
 * Mapper interface for converting between CompanyDto and CompanyEntity.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CompanyMapper {

    /**
     * Converts a CompanyDto object to a CompanyEntity object.
     *
     * @param companyDto The CompanyDto object to be converted.
     * @return The corresponding CompanyEntity object.
     */
    CompanyEntity toEntity(CompanyDto companyDto);

    /**
     * Converts a CompanyEntity object to a CompanyDto object.
     *
     * @param companyEntity The CompanyEntity object to be converted.
     * @return The corresponding CompanyDto object.
     */
    CompanyDto toDto(CompanyEntity companyEntity);

    /**
     * Performs a partial update from a CompanyDto to an existing CompanyEntity.
     * Only non-null properties in the CompanyDto will be applied to the existing CompanyEntity.
     *
     * @param companyDto      The CompanyDto containing the properties to be updated.
     * @param companyEntity   The existing CompanyEntity to be updated.
     * @return The updated CompanyEntity after applying the non-null properties from the CompanyDto.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CompanyEntity partialUpdate(CompanyDto companyDto, @MappingTarget CompanyEntity companyEntity);
}