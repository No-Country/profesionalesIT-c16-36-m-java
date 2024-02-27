package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.entities.LocalityEntity;
import com.nocountry.professionalIT.entities.ProvinceEntity;
import com.nocountry.professionalIT.repository.LocalityRepository;
import com.nocountry.professionalIT.service.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalityServiceImpl implements LocalityService {

    @Autowired
    private LocalityRepository localityRepository;

    @Override
    public List<LocalityEntity> findLocalitiesByProvinceId(Integer id) {
        return localityRepository.findLocalitiesByProvinceId(id);
    }

    @Override
    public List<LocalityEntity> searchLocalities(String search, ProvinceEntity province) {
        return localityRepository.searchLocalities(search,province);
    }
}
