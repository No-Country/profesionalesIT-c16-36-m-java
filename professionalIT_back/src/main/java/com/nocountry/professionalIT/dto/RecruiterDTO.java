package com.nocountry.professionalIT.dto;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * This class represents a Data Transfer Object (DTO) for recruiter entities.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-28
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecruiterDTO {

    /**
     * The unique identifier of the customer.
     */
    private UUID id;

    /**
     * The {@link PersonDTO} object containing information about the recruiter's personal details.
     */
    @Valid
    private PersonDTO person;

    /**
     * The {@link UserDTO} object containing information about the recruiter's user account.
     */
    @Valid
    private UserDTO user;
}
