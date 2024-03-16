package com.nocountry.professionalIT.dto.countries;

import com.nocountry.professionalIT.entities.ProvinceEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This class represents a Data Transfer Object (DTO) for Country entities.
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
public class GetCountry {

    /**
     * The unique identifier of the country
     */
    private Integer id;

    /**
     * The name of the country.
     */
    private String name;
}
