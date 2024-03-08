package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.HardSkillsDto;
import com.nocountry.professionalIT.entities.HardSkillsEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface HardSkillsMapper {
    HardSkillsEntity toEntity(HardSkillsDto hardSkillsDto);

    HardSkillsDto toDto(HardSkillsEntity hardSkillsEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    HardSkillsEntity partialUpdate(HardSkillsDto hardSkillsDto, @MappingTarget HardSkillsEntity hardSkillsEntity);
}