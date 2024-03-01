package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.EnterpriseDTO;
import com.nocountry.professionalIT.entities.EnterpriseEntity;
import com.nocountry.professionalIT.exception.ObjectNotFoundException;
import com.nocountry.professionalIT.repository.EnterpriseRepository;
import com.nocountry.professionalIT.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    @Override
    public EnterpriseEntity saveEnterprise(EnterpriseDTO enterpriseDTO) {
        EnterpriseEntity enterprise = EnterpriseEntity.builder()
                .name(enterpriseDTO.getName())
                .description(enterpriseDTO.getDescription())
                .logo(enterpriseDTO.getLogo())
                .build();
        return enterpriseRepository.save(enterprise);
    }

    @Override
    public EnterpriseEntity updateEnterprise(Integer id, EnterpriseDTO enterpriseDTO) {
        EnterpriseEntity enterpriseDB = enterpriseRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Empresa no encontrada"));

        enterpriseDB.setName(enterpriseDTO.getName());
        enterpriseDB.setDescription(enterpriseDTO.getDescription());

        return enterpriseRepository.save(enterpriseDB);
    }

    @Override
    public EnterpriseEntity findById(Integer id) {
        return enterpriseRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Empresa no encontrada"));
    }

    @Override
    public List<EnterpriseEntity> findByNameContainingIgnoreCase(String search) {
        return enterpriseRepository.findByNameContainingIgnoreCase(search);
    }


}
