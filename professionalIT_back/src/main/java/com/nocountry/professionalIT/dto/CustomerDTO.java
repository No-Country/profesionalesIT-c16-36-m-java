package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.entities.PersonEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {

    private UUID id;
    private PersonEntity person;
}
