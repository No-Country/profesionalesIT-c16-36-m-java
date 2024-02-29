package com.nocountry.professionalIT.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents a country entity.
 * This entity is mapped to the "countries" table in the database.
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-24
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "countries")
public class CountryEntity {

    /**
     * The unique identifier of the country
     */
    @Id
    @Column(name = "coun_id",columnDefinition = "TINYINT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * The name of the country.
     */
    @Column(name = "coun_name")
    private String name;

    /**
     * The list of people associated with this country.
     */
    @OneToMany(targetEntity = PersonEntity.class, mappedBy = "country",cascade = CascadeType.PERSIST)
    @JsonIgnore
    private List<PersonEntity> people;

    /**
     * The list of provinces within this country.
     */
    @OneToMany(targetEntity = ProvinceEntity.class, mappedBy = "country",
            cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JsonIgnore
    private List<ProvinceEntity> provinces;
}
