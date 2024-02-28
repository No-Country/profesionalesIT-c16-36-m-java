package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.entities.UserEntity;
import com.nocountry.professionalIT.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDTO {

    private UUID id;
    private String name;
    private String lastName;
    private String img;
    private Gender gender;
    private CountryEntity country;
}
