package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.*;


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

}
