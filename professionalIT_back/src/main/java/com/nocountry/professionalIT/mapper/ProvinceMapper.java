package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.ProvinceDTO;
import com.nocountry.professionalIT.entities.ProvinceEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProvinceMapper {

    ProvinceDTO toDto(ProvinceEntity provinceEntity);

    List<ProvinceDTO> toDtoList(List<ProvinceEntity> provinceList);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ProvinceEntity partialUpdate(ProvinceDTO provinceDTO, @MappingTarget ProvinceEntity provinceEntity);
}