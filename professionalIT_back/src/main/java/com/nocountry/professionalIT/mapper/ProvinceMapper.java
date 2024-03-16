package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.countries.GetProvince;
import com.nocountry.professionalIT.entities.ProvinceEntity;
import org.mapstruct.*;

import java.util.List;

/**
 * Mapper interface for converting between ProvinceDTOs and ProvinceEntity.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-16
 * */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProvinceMapper {

    GetProvince toDto(ProvinceEntity provinceEntity);

    List<GetProvince> toDtoList(List<ProvinceEntity> provinceList);
}