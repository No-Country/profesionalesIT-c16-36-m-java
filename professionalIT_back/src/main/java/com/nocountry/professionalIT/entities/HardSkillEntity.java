package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity class representing a hard skill.
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
