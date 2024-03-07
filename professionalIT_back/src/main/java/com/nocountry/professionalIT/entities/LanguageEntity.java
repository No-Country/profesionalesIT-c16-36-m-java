package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * Entity class representing a language.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-02-26
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "languages")
public class LanguageEntity {


    /**
     * Unique identifier for a language.
     */
    @Id
    @Column(name= "lang_id", columnDefinition = "TINYINT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Name of the language.
     */
    @Column(name = "lang_name")
    private String name;

    @OneToMany(mappedBy = "language", cascade = CascadeType.PERSIST)
    private List<KnowLanguageEntity> knowLanguages;
}
