package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.dto.users.NewPerson;
import com.nocountry.professionalIT.dto.users.NewUser;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * This class represents a Data Transfer Object (DTO) for customer entities.
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
public class CustomerDTO {

    /**
     * The unique identifier of the customer.
     */
    private UUID id;

    /**
     * The {@link NewPerson} object containing information about the customer's personal details.
     */
    @Valid
    private NewPerson person;

    /**
     * The {@link NewUser} object containing information about the customer's user account.
     */
    @Valid
    private NewUser user;
}
