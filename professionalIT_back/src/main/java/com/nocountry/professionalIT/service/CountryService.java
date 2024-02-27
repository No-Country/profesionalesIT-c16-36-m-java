package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.CountryEntity;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    Optional<CountryEntity> findById(Integer id);

    List<CountryEntity> findAll();
}
