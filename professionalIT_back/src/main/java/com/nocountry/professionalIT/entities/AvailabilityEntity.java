package com.nocountry.professionalIT.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "availabilities")
public class AvailabilityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String startTime;

    private String endTime;

    @OneToMany(mappedBy = "availabilities", cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnore
    private List<ProfessionalEntity> professional;
}
