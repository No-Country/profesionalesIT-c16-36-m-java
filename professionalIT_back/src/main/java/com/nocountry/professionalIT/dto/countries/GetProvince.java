package com.nocountry.professionalIT.dto.countries;

import com.nocountry.professionalIT.entities.CountryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class represents a Data Transfer Object (DTO) for province entities.
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
public class GetProvince {

    /**
     * The unique identifier of the province.
     */
    private Integer id;

    /**
     * The name of the province.
     */
    private String name;
}
