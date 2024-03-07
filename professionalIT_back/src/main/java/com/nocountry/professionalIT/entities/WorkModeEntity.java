package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.*;
/**
 * Entity class representing a work mode.
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "work_modes" )
public class WorkModeEntity {

    /**
     * Unique identifier for the work mode.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wm_id")
    private Integer id;

    /**
     * Parent work mode associated with this work mode.
     */
    @ManyToOne
    @JoinColumn(name = "wm_modeid", referencedColumnName = "mode_id")
    private ModeEntity mode;

    /**
     * Professional associated with this work mode.
     */
    @ManyToOne
    @JoinColumn(name = "wm_profeid")
    private ProfessionalEntity professional;
}
