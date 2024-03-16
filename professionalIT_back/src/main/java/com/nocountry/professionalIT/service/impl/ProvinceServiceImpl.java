package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.countries.GetProvince;
import com.nocountry.professionalIT.entities.ProvinceEntity;
import com.nocountry.professionalIT.mapper.ProvinceMapper;
import com.nocountry.professionalIT.repository.ProvinceRepository;
import com.nocountry.professionalIT.service.ProvinceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the ProvinceService interface that provides
 * methods to access province information.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-16
 * */
@RequiredArgsConstructor
@Service
public class ProvinceServiceImpl implements ProvinceService {

    private final ProvinceRepository provinceRepository;

    private final ProvinceMapper provinceMapper;

    /**
     * Searches for provinces by name and country ID.
     *
     * @param search The search string to match against province names.
     * @param countryId The ID of the country to filter provinces.
     * @return A list of provinces matching the search string and country ID.
     */
    @Override
    public List<GetProvince> searchProvinces(String search, Integer countryId) {
        List<ProvinceEntity> provinces;
        if (search == null || search.isEmpty()){
            provinces = provinceRepository.findProvincesByCountryId(countryId);
        }else {
            provinces = provinceRepository.searchProvinces(search,countryId);
        }
        return provinceMapper.toDtoList(provinces);
    }
}
