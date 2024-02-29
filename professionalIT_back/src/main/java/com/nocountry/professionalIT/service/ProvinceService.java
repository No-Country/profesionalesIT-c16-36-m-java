package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.entities.ProvinceEntity;

import java.util.List;
import java.util.Optional;

public interface ProvinceService {

    Optional<ProvinceEntity> findById (Integer id);

    List<ProvinceEntity> findProvincesByCountryId (Integer id);

    List<ProvinceEntity> searchProvinces (String search, CountryEntity country);
}
