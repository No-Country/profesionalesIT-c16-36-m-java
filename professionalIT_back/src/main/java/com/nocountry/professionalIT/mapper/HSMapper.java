package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.HSDto;
import com.nocountry.professionalIT.entities.HSEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface HSMapper {
    HSEntity toEntity(HSDto HSDto);

    HSDto toDto(HSEntity HSEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    HSEntity partialUpdate(HSDto HSDto, @MappingTarget HSEntity HSEntity);
}