package com.nocountry.professionalIT.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Entity class representing a hard skill (hs).
 * @version 1.0
 * @since 2024-02-26
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "hs" )
public class HSEntity {

    /**
     * Unique identifier for the hard skill.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hs_id")
    private Integer id;

    /**
     * Name of the hard skill.
     */
    @Column(name = "hs_name")
    private String name;

    /**
     * The list of hard skills associated with this hs.
     */
    @OneToMany(mappedBy = "hs", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<HardSkillsEntity> hardSkills;
}
