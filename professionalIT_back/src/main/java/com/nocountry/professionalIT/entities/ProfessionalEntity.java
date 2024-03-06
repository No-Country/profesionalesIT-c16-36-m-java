package com.nocountry.professionalIT.entities;

import com.nocountry.professionalIT.enums.Seniority;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Represents a professional entity.
 * This entity is mapped to the "professionals" table in the database.
 * @author Gonzalo Delgado
 * @email: gonzadelgado.geo@gmail.com
 * @version 1.0
 * @since 2024-02-26
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "professionals")
public class ProfessionalEntity {

    /**
     * The unique identifier of the professional.
     */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "profe_id")
    private UUID id;

    /**
     * The portfolio of the professional.
     */
    @Column(name = "profe_portfolio")
    private String portfolio;

    /**
     * The list of work modes of the professional.
     */
    @OneToMany(mappedBy = "professional")
    private List<WorkModeEntity> workModes;

    /**
     * The availabilities of the professional.
     */
    @OneToMany(mappedBy = "professional")
    private List<AvailabilityEntity> availabities;

    @Column(name = "profe_availinmediate")
    private Boolean availInmediate;

    @Column(name = "profe_availtravel")
    private Boolean availTravel;

    /**
     * The list of skills of the professional.
     */
    @OneToMany
    private List<SkillEntity> skillList;

    /**
     * The person associated with this professional.
     */
    @OneToOne(targetEntity = PersonEntity.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    @JoinColumn(name = "profe_personid",referencedColumnName = "person_id")
    private PersonEntity person;

    /**
     * The field of specialization of the professional.
     */
    @ManyToOne
    @JoinColumn (name = "profe_fieldid",referencedColumnName = "field_id")
    private  FieldEntity fieldId;

    /**
     * The seniority level of the professional.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "profe_seniid")
    private Seniority seniority;

    /**
     * The list of work experiences of the professional.
     */
    @OneToMany(mappedBy = "professional")
    private List<WorkExperienceEntity> workExperienceList;

    /**
     * The list of languages known by the professional.
     */
    @OneToMany(mappedBy = "professional")
    private List<KnowLanguageEntity> knowLanguage;

    /**
     * The date when the professional was last updated.
     */
    @Column(name = "profe_dateupdated")
    private LocalDateTime updatedDate;

    /**
     * The date when the professional was created.
     */
    @Column(name = "profe_createdate")
    private LocalDateTime createdDate;

}