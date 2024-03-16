package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.countries.GetLocality;
import com.nocountry.professionalIT.entities.LocalityEntity;
import com.nocountry.professionalIT.mapper.LocalityMapper;
import com.nocountry.professionalIT.repository.LocalityRepository;
import com.nocountry.professionalIT.service.LocalityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the LocalityService interface that provides
 * methods to access locality information.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-16
 * */
@RequiredArgsConstructor
@Service
public class LocalityServiceImpl implements LocalityService {

    private final LocalityRepository localityRepository;

    private final LocalityMapper localityMapper;

    /**
     * Searches for localities by name and province ID.
     *
     * @param search   The search string to match against locality names.
     * @param provinceId The ID of the province to filter localities.
     * @return A list of localities matching the search string and province ID.
     */
    @Override
    public List<GetLocality> searchLocalities(String search, Integer provinceId) {
        List<LocalityEntity> localities;
        if (search == null || search.isEmpty()){
            localities = localityRepository.findLocalitiesByProvinceId(provinceId);
        }else{
            localities = localityRepository.searchLocalities(search,provinceId);
        }
        return localityMapper.toDtoList(localities);
    }
}
