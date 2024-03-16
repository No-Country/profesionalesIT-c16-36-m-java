package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.dto.users.NewPerson;
import com.nocountry.professionalIT.dto.users.NewUser;
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
    private NewPerson person;

    @Valid
    private NewUser user;
}
