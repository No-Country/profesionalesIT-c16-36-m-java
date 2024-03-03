package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.LocalityEntity;
import com.nocountry.professionalIT.entities.ProvinceEntity;

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
     * Searches for localities based on the provided search string and province.
     *
     * @param search   The search string to match against locality names.
     * @param province The province entity to filter localities.
     * @return A list of localities matching the search string and province.
     */
    List<LocalityEntity> searchLocalities (String search, ProvinceEntity province);
}
