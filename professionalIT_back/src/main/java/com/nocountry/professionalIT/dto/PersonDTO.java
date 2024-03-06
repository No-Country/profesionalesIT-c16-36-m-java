package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.entities.LocalityEntity;
import com.nocountry.professionalIT.entities.ProvinceEntity;
import com.nocountry.professionalIT.enums.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * This class represents a Data Transfer Object (DTO) for person entities.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-02
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDTO {

    /**
     * The unique identifier of the person.
     */
    private UUID id;

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

    /**
     * The person's gender, which must be specified.
     */
    @NotNull(message = "Seleccione su genero")
    private Gender gender;

    /**
     * The person's country of residence, which must be specified.
     */
    @NotNull(message = "Seleccione su pais")
    private CountryEntity country;

    /**
     * The person's province of residence, which must be specified.
     */
    @NotNull(message = "Seleccione su provincia")
    private ProvinceEntity province;

    /**
     * The person's locality of residence, which must be specified.
     */
    @NotNull(message = "Seleccione su localidad ")
    private LocalityEntity locality;
}
