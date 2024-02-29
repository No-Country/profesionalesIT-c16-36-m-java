package com.nocountry.professionalIT.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecruiterDTO {

    private UUID id;
    private PersonDTO person;
    private UserDTO user;
}
