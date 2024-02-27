package com.nocountry.professionalIT.entities;

import com.nocountry.professionalIT.enums.LanguageLevel;
import jakarta.persistence.*;
import lombok.*;

/**
 * Entity class representing a known language with proficiency level.
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
    //incompatible cambiar por byte(tinyInt)

    /**
     * Known language associated with the language.
     */
    @ManyToOne
    @JoinColumn(name = "kl_langid", referencedColumnName = "lang_id")
    private LanguageEntity language;

    /**
     * Proficiency level of the known language.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="kl_level")
    private LanguageLevel level;

    /**
     * Professional associated with the known languages.
     */
    @ManyToOne
    @JoinColumn(name = "kl_profeid", referencedColumnName = "profe_id")
    private ProfessionalEntity professional;



}
