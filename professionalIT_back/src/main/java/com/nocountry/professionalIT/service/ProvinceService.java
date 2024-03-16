package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.countries.GetProvince;

import java.util.List;

/**
 * Service interface for managing ProvinceEntity
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-16
 * */
public interface ProvinceService {

    /**
     * Searches for provinces by name and country ID.
     *
     * @param search The search string to match against province names.
     * @param countryId The ID of the country to filter provinces.
     * @return A list of provinces matching the search string and country ID.
     */
    List<GetProvince> searchProvinces (String search, Integer countryId);
}
