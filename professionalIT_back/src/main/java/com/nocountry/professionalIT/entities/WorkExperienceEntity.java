package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

/**
 * Entity class representing work experiences of a ProfessionalIT.
 *  @author Claudia Ortiz
 *  @version 1.0
 *  @since 2024-02-26
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "work_experiences")
public class WorkExperienceEntity {

    /**
     * Unique identifier for a work experience.
     */
    @Id
    @Column(name = "we_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Status of the work experience.
     */
    @Column(name = "we_status")
    private Boolean status;

    /**
     * Company associated with the work experience.
     */
    @ManyToOne
    @JoinColumn(name = "we_compaid", referencedColumnName = "compa_id")
    private CompanyEntity company;

    /**
     * Position held during the work experience.
     */
    @Column(name = "we_position")
    private String position;

    /**
     * Description of the work experience.
     */
    @Column(name = "we_description")
    private String description;

    /**
     * Start date of the work experience.
     */
    @Column(name = "we_startdate")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    /**
     * End date of the work experience.
     */
    @Column(name = "we_enddate")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    /**
     * Additional details about the work experience.
     */
    @Column(name = "we_workexperience")
    private String workExperience;

    /**
     * Professional associated with the work experience.
     */
    @ManyToOne
    @JoinColumn(name = "we_profeid")
    private ProfessionalEntity professional;

}
