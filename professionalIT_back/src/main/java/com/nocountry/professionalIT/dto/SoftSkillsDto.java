package com.nocountry.professionalIT.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nocountry.professionalIT.entities.SSEntity;
import jakarta.persistence.*;

public class SoftSkillsDto {
    private Integer id;

    @ManyToOne
    @JsonIgnore
    private SSEntity ss;

    @ManyToOne
    @JsonIgnore
    private ProfessionalEntityDto professional;
}
