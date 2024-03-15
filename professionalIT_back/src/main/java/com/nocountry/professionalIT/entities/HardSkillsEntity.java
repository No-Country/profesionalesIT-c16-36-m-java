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
@Table(name = "hard_skills" )
public class HardSkillsEntity {

    /**
     * Unique identifier for the skill set.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hard_id", columnDefinition = "TINYINT")
    private Integer id;

    /**
     * Hard skill associated with the skill set.
     */
    @ManyToOne
    @JoinColumn(name = "hard_hsid")
    private HSEntity hs;

    /**
     * Professional associated with the skill set.
     */
    @ManyToOne
    @JoinColumn(name = "hard_profeid")
    private ProfessionalEntity professional;
}
