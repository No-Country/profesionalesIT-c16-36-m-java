package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.EnterpriseDTO;
import com.nocountry.professionalIT.entities.EnterpriseEntity;
import com.nocountry.professionalIT.mapper.EnterpriseMapper;
import com.nocountry.professionalIT.repository.EnterpriseRepository;
import com.nocountry.professionalIT.service.EnterpriseService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
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

    private final EnterpriseRepository enterpriseRepository;

    private final EnterpriseMapper enterpriseMapper;

    /**
     * Saves a new enterprise based on the provided enterprise DTO.
     *
     * @param enterpriseDTO The DTO containing the data for the new enterprise.
     * @return The newly created enterprise entity.
     */
    @Override
    public EnterpriseDTO saveEnterprise(EnterpriseDTO enterpriseDTO) {
        EnterpriseEntity enterprise = enterpriseRepository
                .save(enterpriseMapper.toEntity(enterpriseDTO));
        return enterpriseMapper.toDto(enterprise);
    }

    /**
     * Updates an existing enterprise with the specified ID based on the provided enterprise DTO.
     *
     * @param id The ID of the enterprise to update.
     * @param enterpriseDTO The DTO containing the updated data for the enterprise.
     * @return The updated enterprise entity.
     * @throws EntityNotFoundException If no customer is found with the given ID.
     */
    @Override
    public EnterpriseDTO updateEnterprise(Integer id, EnterpriseDTO enterpriseDTO) {
        EnterpriseEntity enterpriseDB = enterpriseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Empresa no encontrada"));

        enterpriseDB.setName(enterpriseDTO.getName());
        enterpriseDB.setDescription(enterpriseDTO.getDescription());
        enterpriseRepository.save(enterpriseDB);
        return enterpriseMapper.toDto(enterpriseDB);
    }

    /**
     * Finds an enterprise by its ID.
     *
     * @param id The ID of the enterprise to find.
     * @return The enterprise entity with the specified ID, or null if not found.
     * @throws EntityNotFoundException If no enterprise is found with the given ID.
     */
    @Override
    public EnterpriseDTO findById(Integer id) {
        EnterpriseEntity enterprise = enterpriseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Empresa no encontrada"));
        return enterpriseMapper.toDto(enterprise);
    }

    /**
     * Finds enterprises whose name contains the specified search string, ignoring case.
     *
     * @param search The search string to match against enterprise names.
     * @return A list of enterprises containing the search string in their names, ignoring case.
     */
    @Override
    public List<EnterpriseDTO> findByNameContainingIgnoreCase(String search) {
        List<EnterpriseEntity> enterpriseList = enterpriseRepository
                .findByNameContainingIgnoreCase(search);
        return enterpriseMapper.toDtoList(enterpriseList);
    }
}
