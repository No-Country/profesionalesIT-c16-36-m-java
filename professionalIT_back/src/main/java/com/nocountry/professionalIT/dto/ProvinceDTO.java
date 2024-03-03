package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.entities.LocalityEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This class represents a Data Transfer Object (DTO) for province entities.
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
public class ProvinceDTO {

    /**
     * The unique identifier of the province.
     */
    private Integer id;

    /**
     * The name of the province.
     */
    private String name;

    /**
     * The country to which this province belongs.
     */
    private CountryEntity country;

    /**
     * The list of localities within this province.
     */
    private List<LocalityEntity> localityList;
}
