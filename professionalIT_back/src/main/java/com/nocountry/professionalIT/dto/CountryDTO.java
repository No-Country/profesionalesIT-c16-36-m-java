package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.entities.ProvinceEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CountryDTO {

    private Integer id;
    private String name;
    private List<ProvinceEntity> provinceList;
}
