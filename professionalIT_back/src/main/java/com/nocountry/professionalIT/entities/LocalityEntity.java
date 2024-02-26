package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a locality entity.
 * This entity is mapped to the "localities" table in the database.
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
@Table(name = "localities")
public class LocalityEntity {

    /**
     * The unique identifier of the locality.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "local_id")
    private Integer id;

    /**
     * The name of the locality.
     */
    @Column(name = "local_name")
    private String name;

    /**
     * The province to which this locality belongs.
     */
    @ManyToOne(targetEntity = ProvinceEntity.class)
    @JoinColumn(name = "local_proviid", nullable = false)
    private ProvinceEntity province;
}
