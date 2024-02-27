package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity class representing a field in the IT industry.
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
    @Column(name = "field_id", columnDefinition = "SMALLINT", nullable = false, unique = true)
    private Integer id;

    /**
     * Name of the field.
     */
    @Column(name = "field_name")
    private String name;

}
