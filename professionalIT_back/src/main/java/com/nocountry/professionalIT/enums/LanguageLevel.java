package com.nocountry.professionalIT.enums;

import lombok.Getter;

/**
 * Enumeration representing the proficiency levels of a language.
 * Possible levels are: A1, A2, B1, B2, C1, C2.
 */
@Getter
public enum LanguageLevel {

    /**
     * A1 - Beginner proficiency level in the language.
     */
    A1("Principiante"),

    /**
     * A2 - Elementary proficiency level in the language.
     */
    A2("Elemental"),

    /**
     * B1 - Intermediate proficiency level in the language.
     */
    B1("Intermedio"),

    /**
     * B2 - Upper-Intermediate proficiency level in the language.
     */
    B2("Intermedio-Superior"),

    /**
     * C1 - Advanced proficiency level in the language.
     */
    C1("Avanzado"),

    /**
     * C2 - Proficient proficiency level in the language.
     */
    C2("Competente");

    private final String description;

    LanguageLevel(String description) {
        this.description = description;
    }


}
