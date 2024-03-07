package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Represents a recruiter entity.
 * This entity is mapped to the "recruiters" table in the database.
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
@Table(name = "recruiters")
public class RecruiterEntity {

    /**
     * Unique identifier for the recruiter.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "recru_id")
    private UUID id;

    /**
     * Person associated with the recruiter.
     */
    @OneToOne(targetEntity = PersonEntity.class, cascade = CascadeType.ALL,
            fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "recru_personid")
    private PersonEntity person;

    /**
     * Enterprise associated with the recruiter.
     */
    @ManyToOne(targetEntity = EnterpriseEntity.class)
    @JoinColumn(name = "recru_enterid")
    private EnterpriseEntity enterprise;
}
