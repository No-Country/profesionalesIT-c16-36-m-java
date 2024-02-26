package com.nocountry.professionalIT.entities;

import com.nocountry.professionalIT.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Represents a person entity.
 * This entity is mapped to the "people" table in the database.
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-24
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "people")
public class PersonEntity {

    /**
     * The unique identifier of the person.
     * @see <a src="https://www.geeksforgeeks.org/uuid-primary-keys-in-spring-boot/">more about UUID</a>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "person_id")
    private UUID id;

    /**
     * The name of the person
     * */
    @Column(name = "pers_name")
    private String name;

    /**
     * The lastname of the person
     * */
    @Column(name = "pers_lastname")
    private String lastName;

    /**
     * The image of the person
     * */
    @Column(name = "pers_img")
    private String img;

    /**
     * The gender of the person
     * {@link Gender}
     * */
    @Enumerated(EnumType.STRING)
    @Column(name = "pers_gender")
    private Gender gender;

    /**
     * The user associated with this person.
     */
    @OneToOne(targetEntity = UserEntity.class, cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "pers_userid")
    private UserEntity user;

    /**
     * The country to which this person belongs
     * */
    @ManyToOne(targetEntity = CountryEntity.class)
    @JoinColumn(name = "pers_counid")
    private CountryEntity country;
}
