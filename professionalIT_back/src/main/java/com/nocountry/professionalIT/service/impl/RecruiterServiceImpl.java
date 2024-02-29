package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.PersonDTO;
import com.nocountry.professionalIT.dto.UserDTO;
import com.nocountry.professionalIT.entities.*;
import com.nocountry.professionalIT.enums.Gender;
import com.nocountry.professionalIT.enums.Role;
import com.nocountry.professionalIT.repository.RecruiterRepository;
import com.nocountry.professionalIT.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruiterServiceImpl implements RecruiterService {

    @Autowired
    private RecruiterRepository recruiterRepository;

    @Override
    public RecruiterEntity saveNewRecruiter(PersonDTO personDTO, UserDTO userDTO) {

        UserEntity user = UserEntity.builder()
                .email(userDTO.getEmail())
                .role(Role.RECRUITER)
                .build();

        PersonEntity person = PersonEntity.builder()
                .user(user)
                .name(personDTO.getName())
                .lastName(personDTO.getLastName())
                .gender(Gender.valueOf(personDTO.getGender().name()))
                .country(CountryEntity.builder()
                        .id(personDTO.getCountry().getId())
                        .build())
                .province(ProvinceEntity.builder()
                        .id(personDTO.getProvince().getId())
                        .build())
                .locality(LocalityEntity.builder()
                        .id(personDTO.getLocality().getId())
                        .build())
                .build();

        RecruiterEntity recruiter = RecruiterEntity.builder()
                .person(person)
                .build();
        return recruiterRepository.save(recruiter);
    }
}
