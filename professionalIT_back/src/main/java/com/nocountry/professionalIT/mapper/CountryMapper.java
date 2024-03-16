package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.countries.GetCountry;
import com.nocountry.professionalIT.entities.CountryEntity;
import org.mapstruct.*;

import java.util.List;

/**
 * Mapper interface for converting between CountryDTOs and CountryEntity.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-16
 * */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CountryMapper {

    CountryEntity toEntity(GetCountry country);

    GetCountry toDto(CountryEntity countryEntity);

    List<GetCountry> toDtoList(List<CountryEntity> countryList);
}