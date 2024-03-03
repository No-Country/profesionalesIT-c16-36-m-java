package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.entities.ProvinceEntity;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing ProvinceEntity
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-24
 * */
public interface ProvinceService {

    /**
     * Finds a province by its ID.
     *
     * @param id The ID of the country to find.
     * @return An Optional containing the country with the specified ID, or empty if not found.
     */
    Optional<ProvinceEntity> findById (Integer id);

    /**
     * Finds provinces by country ID.
     *
     * @param id The ID of the province.
     * @return A list of localities associated with the given province ID.
     */
    List<ProvinceEntity> findProvincesByCountryId (Integer id);

    /**
     * Searches for provinces by name and country.
     *
     * @param search The search string to match against province names.
     * @param country The country entity to filter provinces.
     * @return A list of provinces matching the search string and country.
     */
    List<ProvinceEntity> searchProvinces (String search, CountryEntity country);
}
