package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity class representing a soft skill.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "soft_skills" )
public class SoftSkillEntity {

    /**
     * Unique identifier for the soft skill.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ss_id", columnDefinition = "TINYINT")
    private Integer id;

    /**
     * Name of the soft skill.
     */
    @Column(name = "ss_name")
    private String name;
}
