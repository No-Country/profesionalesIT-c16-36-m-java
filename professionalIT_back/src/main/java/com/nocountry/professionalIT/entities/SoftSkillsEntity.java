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
@Builder
@Table(name = "soft_skills" )
public class SoftSkillsEntity {

    /**
     * Unique identifier for the skill set.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "soft_id", columnDefinition = "TINYINT")
    private Integer id;

    /**
     * Soft skill associated with the skill set.
     */
    @ManyToOne
    @JoinColumn(name = "soft_ssid")
    private SSEntity ss;

    /**
     * Professional associated with the skill set.
     */
    @ManyToOne
    @JoinColumn(name = "soft_profeid")
    private ProfessionalEntity professional;
}
