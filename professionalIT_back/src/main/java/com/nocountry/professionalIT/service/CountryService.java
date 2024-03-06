package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.CountryDTO;

import java.util.List;

/**
 * Service interface for managing CountryEntity
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-24
 * */
public interface CountryService {

    /**
     * Finds a country by its ID.
     *
     * @param id The ID of the country to find.
     * @return the country with the specified ID, or empty if not found.
     */
    CountryDTO findById(Integer id);

    /**
     * Retrieves all countries.
     *
     * @return A list of all countries.
     */
    List<CountryDTO> findAll();
}
