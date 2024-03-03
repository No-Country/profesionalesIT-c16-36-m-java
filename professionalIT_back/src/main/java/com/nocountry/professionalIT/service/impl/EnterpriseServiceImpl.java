package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.EnterpriseDTO;
import com.nocountry.professionalIT.entities.EnterpriseEntity;
import com.nocountry.professionalIT.exception.ObjectNotFoundException;
import com.nocountry.professionalIT.repository.EnterpriseRepository;
import com.nocountry.professionalIT.service.EnterpriseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the EnterpriseService interface that provides
 * methods to access enterprise information.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-29
 * */
@RequiredArgsConstructor
@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    /**
     * Saves a new enterprise based on the provided enterprise DTO.
     *
     * @param enterpriseDTO The DTO containing the data for the new enterprise.
     * @return The newly created enterprise entity.
     */
    @Override
    public EnterpriseEntity saveEnterprise(EnterpriseDTO enterpriseDTO) {
        EnterpriseEntity enterprise = EnterpriseEntity.builder()
                .name(enterpriseDTO.getName())
                .description(enterpriseDTO.getDescription())
                .logo(enterpriseDTO.getLogo())
                .build();
        return enterpriseRepository.save(enterprise);
    }

    /**
     * Updates an existing enterprise with the specified ID based on the provided enterprise DTO.
     *
     * @param id The ID of the enterprise to update.
     * @param enterpriseDTO The DTO containing the updated data for the enterprise.
     * @return The updated enterprise entity.
     * @throws ObjectNotFoundException If no customer is found with the given ID.
     */
    @Override
    public EnterpriseEntity updateEnterprise(Integer id, EnterpriseDTO enterpriseDTO) {
        EnterpriseEntity enterpriseDB = enterpriseRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Empresa no encontrada"));

        enterpriseDB.setName(enterpriseDTO.getName());
        enterpriseDB.setDescription(enterpriseDTO.getDescription());

        return enterpriseRepository.save(enterpriseDB);
    }

    /**
     * Finds an enterprise by its ID.
     *
     * @param id The ID of the enterprise to find.
     * @return The enterprise entity with the specified ID, or null if not found.
     * @throws ObjectNotFoundException If no enterprise is found with the given ID.
     */
    @Override
    public EnterpriseEntity findById(Integer id) {
        return enterpriseRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Empresa no encontrada"));
    }

    /**
     * Finds enterprises whose name contains the specified search string, ignoring case.
     *
     * @param search The search string to match against enterprise names.
     * @return A list of enterprises containing the search string in their names, ignoring case.
     */
    @Override
    public List<EnterpriseEntity> findByNameContainingIgnoreCase(String search) {
        return enterpriseRepository.findByNameContainingIgnoreCase(search);
    }


}
