package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity class representing a hard skill.
 * @author Claudia Ortiz
 * @email: claudia.ortiz@uc.cl
 * @version 1.0
 * @since 2024-02-26
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "hard_skills")
public class HardSkillEntity {

    /**
     * Unique identifier for the hard skill.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hs_id", columnDefinition = "TINYINT")
    private Integer id;

    /**
     * Name of the hard skill.
     */
    @Column(name = "hs_name")
    private String name;
}
