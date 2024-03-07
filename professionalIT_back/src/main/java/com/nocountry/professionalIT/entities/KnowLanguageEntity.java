package com.nocountry.professionalIT.entities;

import com.nocountry.professionalIT.enums.LanguageLevel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * Entity class representing a known language with proficiency level.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-02-26
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "known_languages")
public class KnowLanguageEntity {

    /**
     * Unique identifier for a known language.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kl_id")
    private Integer id;
    /**
     * Known language associated with the language.
     */
    @ManyToOne
    @JoinColumn(name = "kl_langid", referencedColumnName = "lang_id")
    private LanguageEntity language;

    @ManyToOne
    @JoinColumn(name = "kl_profeid")
    private ProfessionalEntity professional;

    /**
     * Proficiency level of the known language.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="kl_level")
    private LanguageLevel level;

}
