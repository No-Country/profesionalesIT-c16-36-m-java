package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.EnterpriseDTO;
import com.nocountry.professionalIT.entities.EnterpriseEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EnterpriseMapper {

    EnterpriseEntity toEntity(EnterpriseDTO enterpriseDTO);

    EnterpriseDTO toDto(EnterpriseEntity enterpriseEntity);

    List<EnterpriseDTO> toDtoList(List<EnterpriseEntity> enterpriseList);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    EnterpriseEntity partialUpdate(EnterpriseDTO enterpriseDTO, @MappingTarget EnterpriseEntity enterpriseEntity);
}