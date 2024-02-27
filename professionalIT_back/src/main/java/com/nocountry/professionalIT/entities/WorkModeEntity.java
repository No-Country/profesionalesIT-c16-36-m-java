package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.*;
/**
 * Entity class representing a work mode.
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
    @Column(name = "wm_id", nullable = false, unique = true)
    private Integer id;

    /**
     * Parent work mode associated with this work mode.
     */
    @ManyToOne
    @JoinColumn(name = "wm_modeid", referencedColumnName = "mode_id")
    private ModeEntity mode;

}
