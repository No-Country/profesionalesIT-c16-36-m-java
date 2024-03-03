package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.entities.RecruiterEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.text.html.parser.Entity;
import java.util.List;

/**
 * This class represents a Data Transfer Object (DTO) for enterprise entities.
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
public class EnterpriseDTO {

    /**
     * The unique identifier of the enterprise.
     */
    private Integer id;

    /**
     * The name of the enterprise, which cannot be empty.
     */
    @NotBlank(message = "Ingrese el nombre de la empresa")
    private String name;

    /**
     * A description of the enterprise, which cannot be empty.
     */
    @NotBlank(message ="Ingrese una descripcion de la empresa")
    private String description;

    /**
     * An optional logo URL for the enterprise.
     */
    private String logo;

    /**
     * List of recruiters associated with the enterprise.
     */
    private List<RecruiterEntity> recruiterList;
}
