package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.entities.RecruiterEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnterpriseDTO {

    private Integer id;
    private String name;
    private String description;
    private String logo;
    private List<RecruiterEntity> recruiterList;
}
