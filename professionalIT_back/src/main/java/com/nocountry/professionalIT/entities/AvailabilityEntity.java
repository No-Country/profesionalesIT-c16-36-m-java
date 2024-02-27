package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "availabilities")
public class AvailabilityEntity {

    @Id
    private Integer Id;

    private String startTime;

    private String endTime;

    @ManyToOne
    @JoinColumn(name = "profe_availId")
    private ProfessionalEntity professional;

}
