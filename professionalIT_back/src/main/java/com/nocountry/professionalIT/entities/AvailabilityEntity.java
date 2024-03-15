package com.nocountry.professionalIT.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * Represents an availability entity.
 * This entity is mapped to the "availabilities" table in the database.
 * @version 1.0
 * @since 2024-02-29
 * */
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "availabilities")
public class AvailabilityEntity {

    /**
     * Unique identifier for the availability.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    /**
     * Start time of the availability.
     */
    private String startTime;

    /**
     * End time of the availability.
     */
    private String endTime;

    /**
     * The list of professionals associated with this availability.
     */
    @OneToMany(mappedBy = "availabilities", cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnore
    private List<ProfessionalEntity> professional;
}
