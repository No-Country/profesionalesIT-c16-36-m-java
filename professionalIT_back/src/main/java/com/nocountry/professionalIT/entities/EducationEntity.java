package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

/**
 * Entity class representing education of a ProfessionalIT.
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "educations")
public class EducationEntity {
    /**
     * Unique identifier for an education.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "e_id")
    private Integer id;

    /**
     * Status of the education.
     */
    @Column(name = "e_status")
    private Boolean status;

    /**
     * School associated with the education.
     */
    @ManyToOne
    @JoinColumn(name = "e_school", referencedColumnName = "school_id")
    private SchoolEntity school;

    /**
     * Degree obtained during the education.
     */
    @Column(name = "e_degree")
    private String degree;

    /**
     * Study field of the education.
     */
    @Column(name = "e_studyfield")
    private String studyField;

    /**
     * Grade obtained during the education.
     */
    @Column(name = "e_grade")
    private String grade;

    /**
     * Description of the education.
     */
    @Column(name = "e_description")
    private String description;


    /**
     * Start date of the education.
     */
    @Column(name = "e_startdate")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    /**
     * End date of the education.
     */
    @Column(name = "e_enddate")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    /**
     * Professional associated with the education.
     */
    @ManyToOne
    @JoinColumn(name = "e_profeid")
    private ProfessionalEntity professionalEntity;

}