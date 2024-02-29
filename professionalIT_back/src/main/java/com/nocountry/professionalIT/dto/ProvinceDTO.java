package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.entities.LocalityEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProvinceDTO {

    private Integer id;
    private String name;
    private CountryEntity country;
    private List<LocalityEntity> localityList;
}
