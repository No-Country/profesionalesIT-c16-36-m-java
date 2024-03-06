package com.nocountry.professionalIT.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents an enterprise entity.
 * This entity is mapped to the "enterprises" table in the database.
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-29
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "enterprises")
public class EnterpriseEntity {

    /**
     * Unique identifier for the enterprise.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enter_id")
    private Integer id;

    /**
     * Name of the enterprise.
     */
    @Column(name = "enter_name")
    private String name;

    /**
     * Description of the enterprise.
     */
    @Column(name = "enter_description")
    private String description;

    /**
     * Logo of the enterprise.
     */
    @Column(name = "enter_logo")
    private String logo;

    /**
     * List of recruiters associated with the enterprise.
     */
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<RecruiterEntity> recruiters;
}
