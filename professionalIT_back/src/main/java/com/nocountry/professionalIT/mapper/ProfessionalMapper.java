package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.ProfessionalEntityDto;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import org.mapstruct.*;

import java.util.List;

/**
 * Mapper for the entity {@link ProfessionalEntity} and its DTO {@link ProfessionalEntityDto}.
 * This interface is implemented by MapStruct to generate mapping methods.
 * It provides methods for full conversion, reverse conversion, and partial updates.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-07
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProfessionalMapper {

    /**
     * Converts a ProfessionalEntity object to a ProfessionalEntityDto object.
     *
     * @param professionalEntityDto The ProfessionalEntity object to be converted.
     * @return The corresponding ProfessionalEntityDto object.
     */
    ProfessionalEntity toEntity(ProfessionalEntityDto professionalEntityDto);

    /**
     * Converts a ProfessionalEntityDto object to a ProfessionalEntity object.
     *
     * @param professionalEntity The ProfessionalEntityDto object to be converted.
     * @return The corresponding ProfessionalEntity object.
     */
    ProfessionalEntityDto toDto(ProfessionalEntity professionalEntity);

    /**
     * Converts a list of ProfessionalEntity objects to a list of ProfessionalEntityDto objects.
     *
     * @param professionalEntities The list of ProfessionalEntity objects to be converted.
     * @return The corresponding list of ProfessionalEntityDto objects.
     */
    List<ProfessionalEntityDto> toDtoList(List<ProfessionalEntity> professionalEntities);

    /**
     * Converts a list of ProfessionalEntityDto objects to a list of ProfessionalEntity objects.
     *
     * @param professionalEntityDto The list of ProfessionalEntityDto objects to be converted.
     * @return The corresponding list of ProfessionalEntity objects.
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ProfessionalEntity partialUpdate(ProfessionalEntityDto professionalEntityDto, @MappingTarget ProfessionalEntity professionalEntity);
}