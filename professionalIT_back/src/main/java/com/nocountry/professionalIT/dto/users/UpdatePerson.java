package com.nocountry.professionalIT.dto.users;

import com.nocountry.professionalIT.dto.countries.GetCountry;
import com.nocountry.professionalIT.dto.countries.GetLocality;
import com.nocountry.professionalIT.dto.countries.GetProvince;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * This class represents a DTO to update a PersonEntity.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-16
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdatePerson implements Serializable {

    /**
     * An optional image URL for the person.
     */
    private String img;

    /**
     * The person's gender, which must be specified.
     */
    private String gender;

    /**
     * The person's country of residence, which must be specified.
     */
    private GetCountry country;

    /**
     * The person's province of residence, which must be specified.
     */
    private GetProvince province;

    /**
     * The person's locality of residence, which must be specified.
     */
    private GetLocality locality;
}

