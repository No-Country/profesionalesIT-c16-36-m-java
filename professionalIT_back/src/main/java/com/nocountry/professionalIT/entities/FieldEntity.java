package com.nocountry.professionalIT.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


/**
 * Entity class representing a field in the IT industry.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-02-26
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "fields")
public class FieldEntity {

    /**
     * Unique identifier for the field.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "field_id")
    private Integer id;

    /**
     * Name of the field.
     */
    @Column(name = "field_name")
    private String name;

    @OneToMany(mappedBy = "field", cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnore
    private List<ProfessionalEntity> professional;
}
