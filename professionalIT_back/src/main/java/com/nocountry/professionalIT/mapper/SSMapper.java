package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.SSDto;
import com.nocountry.professionalIT.entities.SSEntity;
import org.mapstruct.*;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SSMapper {

    SSEntity toEntity(SSDto ssDto);
    SSDto toDto(SSEntity ssEntity);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SSEntity partialUpdate(SSDto ssDto, @MappingTarget SSEntity ssEntity);
}