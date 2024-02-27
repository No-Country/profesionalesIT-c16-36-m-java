package com.nocountry.professionalIT.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents a province entity.
 * This entity is mapped to the "provinces" table in the database.
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
@Table(name = "provinces")
public class ProvinceEntity {

    /**
     * The unique identifier of the province.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "provi_id", columnDefinition = "SMALLINT")
    private Integer id;

    /**
     * The name of the province.
     */
    @Column(name = "provi_name")
    private String name;

    /**
     * The country to which this province belongs.
     */
    @ManyToOne(targetEntity = CountryEntity.class)
    @JoinColumn(name = "provi_counid")
    private CountryEntity country;

    /**
     * The list of localities within this province.
     */
    @OneToMany(targetEntity = LocalityEntity.class, mappedBy = "province",
            cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private List<LocalityEntity> localities;
}
