package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.ProvinceDTO;
import com.nocountry.professionalIT.entities.ProvinceEntity;
import com.nocountry.professionalIT.mapper.ProvinceMapper;
import com.nocountry.professionalIT.repository.ProvinceRepository;
import com.nocountry.professionalIT.service.ProvinceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of the ProvinceService interface that provides
 * methods to access province information.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-24
 * */
@RequiredArgsConstructor
@Service
public class ProvinceServiceImpl implements ProvinceService {

    private final ProvinceRepository provinceRepository;

    private final ProvinceMapper provinceMapper;

    /**
     * Finds a province by its ID.
     *
     * @param id The ID of the country to find.
     * @return An Optional containing the country with the specified ID, or empty if not found.
     */
    @Override
    public Optional<ProvinceEntity> findById(Integer id) {
        return provinceRepository.findById(id);
    }

    /**
     * Finds provinces by country ID.
     *
     * @param id The ID of the province.
     * @return A list of localities associated with the given province ID.
     */
    @Override
    public List<ProvinceEntity> findProvincesByCountryId(Integer id) {
        return provinceRepository.findProvincesByCountryId(id);
    }

    /**
     * Searches for provinces by name and country ID.
     *
     * @param search The search string to match against province names.
     * @param countryId The ID of the country to filter provinces.
     * @return A list of provinces matching the search string and country ID.
     */
    @Override
    public List<ProvinceDTO> searchProvinces(String search, Integer countryId) {
        List<ProvinceEntity> provinces;
        if (search == null || search.isEmpty()){
            provinces = provinceRepository.findProvincesByCountryId(countryId);
        }else {
            provinces = provinceRepository.searchProvinces(search,countryId);
        }
        return provinceMapper.toDtoList(provinces);
    }
}
