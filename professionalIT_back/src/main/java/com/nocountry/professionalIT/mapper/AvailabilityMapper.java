package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.AvailabilityDto;
import com.nocountry.professionalIT.entities.AvailabilityEntity;
import org.mapstruct.*;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AvailabilityMapper {

        AvailabilityEntity toEntity(AvailabilityDto availabilityDto);

        AvailabilityDto toDto(AvailabilityEntity availabilityEntity);

        @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
        AvailabilityEntity partialUpdate(AvailabilityDto availabilityDto, @MappingTarget AvailabilityEntity availabilityEntity);

}
