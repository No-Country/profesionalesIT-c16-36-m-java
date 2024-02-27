package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.LocalityEntity;
import com.nocountry.professionalIT.entities.ProvinceEntity;

import java.util.List;

public interface LocalityService {

    List<LocalityEntity> findLocalitiesByProvinceId (Integer id);

    List<LocalityEntity> searchLocalities (String search, ProvinceEntity province);
}
