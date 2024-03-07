package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.LocalityDTO;
import com.nocountry.professionalIT.entities.LocalityEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface LocalityMapper {

    LocalityDTO toDtoList(LocalityEntity localityEntity);

    List<LocalityDTO> toDtoList(List<LocalityEntity> localityEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    LocalityEntity partialUpdate(LocalityDTO localityDTO, @MappingTarget LocalityEntity localityEntity);
}