package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.CountryDTO;
import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.mapper.CountryMapper;
import com.nocountry.professionalIT.repository.CountryRepository;
import com.nocountry.professionalIT.service.CountryService;
import jakarta.persistence.EntityNotFoundException;
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
 * @since 2024-02-24
 * */
@RequiredArgsConstructor
@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    private final CountryMapper countryMapper;

    /**
     * Finds a country by its ID.
     *
     * @param id The ID of the country to find.
     * @return An Optional containing the country with the specified ID, or empty if not found.
     */
    @Override
    public CountryDTO findById(Integer id) {
        CountryEntity country = countryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Pais no encontrado"));
        return countryMapper.toDto(country);
    }

    /**
     * Retrieves all countries.
     *
     * @return A list of all countries.
     */
    @Override
    public List<CountryDTO> findAll() {
        List<CountryEntity> countries = countryRepository.findAll();
        countries.forEach(country -> country.setProvinces(null));
        return countryMapper.toDtoList(countries);
    }
}
