package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.CountryDTO;
import com.nocountry.professionalIT.entities.CountryEntity;
import org.mapstruct.*;

import java.util.List;
/**
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-5
 * */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CountryMapper {

    @Mapping(source = "provinces", target = "provinceList")
    CountryDTO toDto(CountryEntity countryEntity);

    List<CountryDTO> toDtoList(List<CountryEntity> countryList);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CountryEntity partialUpdate(CountryDTO countryDTO, @MappingTarget CountryEntity countryEntity);
}