package com.nocountry.professionalIT.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * Entity class representing a soft skill.
 * @author
 * @version 1.0
 * @since 2024-02-26
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "ss" )
public class SSEntity {

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

    /**
     * The list of soft skills associated with this ss.
     */
    @OneToMany(mappedBy = "ss", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<SoftSkillsEntity> softSkills;
}
