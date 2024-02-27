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


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "professionals")
public class ProfessionalEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "profe_id")
    private UUID id;

    @Column(name = "profe_portfolio")
    private String portfolio;

    @Column(name = "cv")
    private String cv;

    @OneToMany
    @JoinColumn(name = "profe_WMId",referencedColumnName = "wm_id")
    private List<WorkModeEntity> workModeId;

    @OneToOne
    @JoinColumn(name = "profe_availId",referencedColumnName = "avail_id")
    private List<availEntity> availabities;

    @OneToMany
    @JoinColumn(name = "profe_skillId",referencedColumnName = "skill_id")
    private List<SkillEntity> skillList;

    @OneToOne
    @JoinColumn(name = "profe_personId",referencedColumnName = "person_id")
    private PersonEntity person;

    @ManyToOne
    @JoinColumn (name = "profe_fieldId",referencedColumnName = "field_id")
    private  FieldEntity fieldId;

    @Enumerated(EnumType.STRING)
    @Column(name = "profe_seniId")
    private Seniority seniority;

    @OneToMany
    @JoinColumn(name = "profe_WEId",referencedColumnName = "we_id")
    private List<WorkExperience> workExperienceList;

    @OneToMany
    @JoinColumn(name = "profe_KLId",referencedColumnName = "kl_id")
    private List<KnowLaguageEntity> knowLanguageList;

    @Column(name = "profe_dateUpdated")
    private LocalDateTime updatedDate;

    @Column(name = "createdDate")
    private LocalDateTime createdDate;

}
