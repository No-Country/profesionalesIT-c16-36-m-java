package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.countries.GetLocality;

import java.util.List;

/**
 * Service interface for managing LocalityEntity
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-16
 * */
public interface LocalityService {

    /**
     * Searches for localities by name and province ID.
     *
     * @param search   The search string to match against locality names.
     * @param provinceId The ID of the province to filter localities.
     * @return A list of localities matching the search string and province ID.
     */
    List<GetLocality> searchLocalities (String search, Integer provinceId);
}
