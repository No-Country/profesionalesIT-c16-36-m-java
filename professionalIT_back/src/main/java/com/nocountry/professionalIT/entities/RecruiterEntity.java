package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "recruiter")
public class RecruiterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "recru_id")
    private UUID id;

    @OneToOne(targetEntity = PersonEntity.class, cascade = CascadeType.ALL,
            fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "recru_personid")
    private PersonEntity person;

    @ManyToOne(targetEntity = EnterpriseEntity.class)
    @JoinColumn(name = "recru_enterid")
    private EnterpriseEntity enterprise;
}
