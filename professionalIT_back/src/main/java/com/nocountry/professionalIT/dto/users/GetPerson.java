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
 * This class represents a DTO to get a PersonEntity.
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
public class GetPerson implements Serializable {

    private GetUser user;

    private String name;

    private String lastName;

    private String img;

    private GetCountry country;

    private GetProvince province;

    private GetLocality locality;
}
