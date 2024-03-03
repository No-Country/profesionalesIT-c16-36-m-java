package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.repository.CountryRepository;
import com.nocountry.professionalIT.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of the CountryService interface that provides
 * methods to access country information.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-24
 * */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    /**
     * Finds a country by its ID.
     *
     * @param id The ID of the country to find.
     * @return An Optional containing the country with the specified ID, or empty if not found.
     */
    @Override
    public Optional<CountryEntity> findById(Integer id) {
        return countryRepository.findById(id);
    }

    /**
     * Retrieves all countries.
     *
     * @return A list of all countries.
     */
    @Override
    public List<CountryEntity> findAll() {
        return countryRepository.findAll();
    }
}
