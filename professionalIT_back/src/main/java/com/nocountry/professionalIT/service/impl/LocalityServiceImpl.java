package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.entities.LocalityEntity;
import com.nocountry.professionalIT.entities.ProvinceEntity;
import com.nocountry.professionalIT.repository.LocalityRepository;
import com.nocountry.professionalIT.service.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the LocalityService interface that provides
 * methods to access locality information.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-24
 * */
@Service
public class LocalityServiceImpl implements LocalityService {

    @Autowired
    private LocalityRepository localityRepository;

    /**
     * Finds localities by province ID.
     *
     * @param id The ID of the province.
     * @return A list of localities associated with the given province ID.
     */
    @Override
    public List<LocalityEntity> findLocalitiesByProvinceId(Integer id) {
        return localityRepository.findLocalitiesByProvinceId(id);
    }

    /**
     * Searches for localities based on the provided search string and province.
     *
     * @param search   The search string to match against locality names.
     * @param province The province entity to filter localities.
     * @return A list of localities matching the search string and province.
     */
    @Override
    public List<LocalityEntity> searchLocalities(String search, ProvinceEntity province) {
        return localityRepository.searchLocalities(search,province);
    }
}
