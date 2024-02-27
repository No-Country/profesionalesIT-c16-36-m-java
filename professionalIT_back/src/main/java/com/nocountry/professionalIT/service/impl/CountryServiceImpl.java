package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.repository.CountryRepository;
import com.nocountry.professionalIT.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Optional<CountryEntity> findById(Integer id) {
        return countryRepository.findById(id);
    }

    @Override
    public List<CountryEntity> findAll() {
        return countryRepository.findAll();
    }
}
