package com.nocountry.professionalIT.entities;

import com.nocountry.professionalIT.enums.Seniority;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
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
     * The curriculum vitae (CV) of the professional.
     */
    @Column(name = "cv")
    private String cv;

    /**
     * The list of work modes of the professional.
     */
    @OneToMany
    @JoinColumn(name = "profe_WMId",referencedColumnName = "wm_id")
    private List<WorkModeEntity> workModeId;

    /**
     * The availabilities of the professional.
     */
    @OneToOne
    @JoinColumn(name = "profe_availId",referencedColumnName = "avail_id")
    private List<availEntity> availabities;

    /**
     * The list of skills of the professional.
     */
    @OneToMany
    @JoinColumn(name = "profe_skillId",referencedColumnName = "skill_id")
    private List<SkillEntity> skillList;

    /**
     * The person associated with this professional.
     */
    @OneToOne
    @JoinColumn(name = "profe_personId",referencedColumnName = "person_id")
    private PersonEntity person;

    /**
     * The field of specialization of the professional.
     */
    @ManyToOne
    @JoinColumn (name = "profe_fieldId",referencedColumnName = "field_id")
    private  FieldEntity fieldId;

    /**
     * The seniority level of the professional.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "profe_seniId")
    private Seniority seniority;

    /**
     * The list of work experiences of the professional.
     */
    @OneToMany
    @JoinColumn(name = "profe_WEId",referencedColumnName = "we_id")
    private List<WorkExperience> workExperienceList;

    /**
     * The list of languages known by the professional.
     */
    @OneToMany
    @JoinColumn(name = "profe_KLId",referencedColumnName = "kl_id")
    private List<KnowLaguageEntity> knowLanguageList;

    /**
     * The date when the professional was last updated.
     */
    @Column(name = "profe_dateUpdated")
    private LocalDateTime updatedDate;

    /**
     * The date when the professional was created.
     */
    @Column(name = "createdDate")
    private LocalDateTime createdDate;

}
