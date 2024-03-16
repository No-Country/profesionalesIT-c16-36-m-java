package com.nocountry.professionalIT.dto.countries;

import com.nocountry.professionalIT.entities.ProvinceEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class represents a Data Transfer Object (DTO) for locality entities.
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
public class GetLocality {

    /**
     * The unique identifier of the locality
     */
    private Integer id;

    /**
     * The name of the locality
     */
    private String name;
}
