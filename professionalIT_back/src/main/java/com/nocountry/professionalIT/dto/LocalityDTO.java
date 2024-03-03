package com.nocountry.professionalIT.dto;

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
 * @since 2024-02-24
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocalityDTO {

    /**
     * The unique identifier of the locality
     */
    private Integer id;

    /**
     * The name of the locality
     */
    private String name;

    /**
     * The province to which this locality belongs.
     */
    private ProvinceEntity province;
}
