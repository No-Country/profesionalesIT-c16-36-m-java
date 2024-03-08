package com.nocountry.professionalIT.dto;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaveProfessional {

    @Valid
    private PersonDTO person;

    @Valid
    private UserDTO user;
}
