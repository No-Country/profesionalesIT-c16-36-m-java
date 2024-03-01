package com.nocountry.professionalIT.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "enterprises")
public class EnterpriseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enter_id")
    private Integer id;

    @Column(name = "enter_name")
    private String name;

    @Column(name = "enter_description")
    private String description;

    @Column(name = "enter_logo")
    private String logo;

    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<RecruiterEntity> recruiters;
}
