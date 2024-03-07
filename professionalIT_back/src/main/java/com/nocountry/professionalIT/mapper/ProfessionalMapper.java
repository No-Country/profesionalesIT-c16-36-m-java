package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.ProfessionalEntityDto;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProfessionalMapper {
    ProfessionalEntity toEntity(ProfessionalEntityDto professionalEntityDto);

    ProfessionalEntityDto toDto(ProfessionalEntity professionalEntity);

    List<ProfessionalEntityDto> toDtoList(List<ProfessionalEntity> professionalEntities);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ProfessionalEntity partialUpdate(ProfessionalEntityDto professionalEntityDto, @MappingTarget ProfessionalEntity professionalEntity);
}