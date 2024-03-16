package com.nocountry.professionalIT.dto.users;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * This class represents a DTO to save a new PersonEntity.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-16
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewPerson implements Serializable {

    private NewUser user;
    /**
     * The person's first name, which cannot be empty.
     */
    @NotBlank(message = "El nombre es requerido")
    private String name;

    /**
     * The person's last name, which cannot be empty.
     */
    @NotBlank(message = "El apellido es requerido")
    private String lastName;

    /**
     * An optional image URL for the person.
     */
    private String img;
}
