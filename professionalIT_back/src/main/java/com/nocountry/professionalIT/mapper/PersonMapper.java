package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.users.GetPerson;
import com.nocountry.professionalIT.dto.users.NewPerson;
import com.nocountry.professionalIT.entities.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {CountryMapper.class, ProvinceMapper.class,
                LocalityMapper.class, UserMapper.class})
public interface PersonMapper {

    PersonEntity toSaveEntity(NewPerson person);

    GetPerson toDTO(PersonEntity person);
}
