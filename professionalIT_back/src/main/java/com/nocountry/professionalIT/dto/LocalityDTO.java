package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.entities.ProvinceEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocalityDTO {

    private Integer id;
    private String name;
    private ProvinceEntity province;
}
