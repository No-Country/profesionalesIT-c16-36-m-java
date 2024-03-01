package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.EnterpriseDTO;
import com.nocountry.professionalIT.entities.EnterpriseEntity;

import java.util.List;

public interface EnterpriseService {

    EnterpriseEntity saveEnterprise(EnterpriseDTO enterpriseDTO);

    EnterpriseEntity updateEnterprise(Integer id, EnterpriseDTO enterpriseDTO);

    EnterpriseEntity findById (Integer id);

    List<EnterpriseEntity> findByNameContainingIgnoreCase (String search);

}
