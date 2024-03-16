package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.countries.GetCountry;

import java.util.List;

/**
 * Service interface for managing CountryEntity
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-16
 * */
public interface CountryService {

    /**
     * Retrieves all countries.
     *
     * @return A list of all countries.
     */
    List<GetCountry> findAll();
}
