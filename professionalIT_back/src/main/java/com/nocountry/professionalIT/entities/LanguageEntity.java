package com.nocountry.professionalIT.entities;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity class representing a language.
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
    @Column(name= "lang_id")
    private Integer id;


    /**
     * Name of the language.
     */
    @Column(name = "lang_name")
    private String name;
}
