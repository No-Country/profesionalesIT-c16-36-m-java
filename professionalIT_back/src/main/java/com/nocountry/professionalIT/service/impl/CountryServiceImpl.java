package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.countries.GetCountry;
import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.mapper.CountryMapper;
import com.nocountry.professionalIT.repository.CountryRepository;
import com.nocountry.professionalIT.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the CountryService interface that provides
 * methods to access country information.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-16
 * */
@RequiredArgsConstructor
@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    private final CountryMapper countryMapper;

    /**
     * Retrieves all countries.
     *
     * @return A list of all countries.
     */
    @Override
    public List<GetCountry> findAll() {
        List<CountryEntity> countries = countryRepository.findAll();
        countries.forEach(country -> country.setProvinces(null));
        return countryMapper.toDtoList(countries);
    }
}
