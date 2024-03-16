package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.countries.GetLocality;
import com.nocountry.professionalIT.entities.LocalityEntity;
import org.mapstruct.*;

import java.util.List;

/**
 * Mapper interface for converting between LocalityDTOs and LocalityEntity.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-16
 * */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LocalityMapper {

    GetLocality toDtoList(LocalityEntity localityEntity);

    List<GetLocality> toDtoList(List<LocalityEntity> localityEntity);
}