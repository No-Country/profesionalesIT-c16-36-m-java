package com.nocountry.professionalIT.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "hs" )
public class HSEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hs_id")
    private Integer id;

    @Column(name = "hs_name")
    private String name;

    @OneToMany(mappedBy = "hs", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<HardSkillsEntity> hardSkills;
}
