package com.nocountry.professionalIT.mapper;

import com.nocountry.professionalIT.dto.UserDTO;
import com.nocountry.professionalIT.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

/**
 * @author Karen Urbano
 * @email: nodoycorreos@gmail.com
 * @version 1.0
 * @since 2024-03-7
 * */

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    UserDTO toDto(UserEntity userEntity);

    UserEntity toEntity(UserDTO userDTO);
}
