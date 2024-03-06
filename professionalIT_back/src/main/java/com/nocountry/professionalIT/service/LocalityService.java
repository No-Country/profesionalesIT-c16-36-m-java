package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.LocalityDTO;
import com.nocountry.professionalIT.entities.LocalityEntity;

import java.util.List;

/**
 * Service interface for managing LocalityEntity
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-24
 * */
public interface LocalityService {

    /**
     * Finds localities by province ID.
     *
     * @param id The ID of the province.
     * @return A list of localities associated with the given province ID.
     */
    List<LocalityEntity> findLocalitiesByProvinceId (Integer id);

    /**
     * Searches for localities by name and province ID.
     *
     * @param search   The search string to match against locality names.
     * @param provinceId The ID of the province to filter localities.
     * @return A list of localities matching the search string and province ID.
     */
    List<LocalityDTO> searchLocalities (String search, Integer provinceId);
}
