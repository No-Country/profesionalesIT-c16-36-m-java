package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity class representing a skill set.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-02-26
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "skills" )
public class SkillEntity {

    /**
     * Unique identifier for the skill set.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Integer id;

    /**
     * Soft skill associated with the skill set.
     */
    @ManyToOne
    @JoinColumn(name = "skill_ssid", referencedColumnName = "ss_id")
    private SoftSkillEntity softSkill;

    /**
     * Hard skill associated with the skill set.
     */
    @ManyToOne
    @JoinColumn(name = "skill_hsid", referencedColumnName = "hs_id")
    private HardSkillEntity hardSkill;

}
