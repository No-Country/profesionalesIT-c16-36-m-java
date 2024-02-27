package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity class representing a part of a work mode.
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "modes" )
public class ModeEntity {

    /**
     * Unique identifier for the mode part.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mode_id", columnDefinition = "TINYINT")
    private Integer id;

    /**
     * Name of the mode part.
     */
    @Column(name = "mode_name")
    private String name;

}

