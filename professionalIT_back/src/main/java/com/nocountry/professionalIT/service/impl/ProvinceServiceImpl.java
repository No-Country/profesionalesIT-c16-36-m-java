package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.entities.ProvinceEntity;
import com.nocountry.professionalIT.repository.ProvinceRepository;
import com.nocountry.professionalIT.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Optional<ProvinceEntity> findById(Integer id) {
        return provinceRepository.findById(id);
    }

    @Override
    public List<ProvinceEntity> findProvincesByCountryId(Integer id) {
        return provinceRepository.findProvincesByCountryId(id);
    }

    @Override
    public List<ProvinceEntity> searchProvinces(String search, CountryEntity country) {
        return provinceRepository.searchProvinces(search,country);
    }
}
