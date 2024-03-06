package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.EnterpriseDTO;

import java.util.List;

/**
 * Service interface for managing EnterpriseEntity
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-29
 * */
public interface EnterpriseService {

    /**
     * Saves a new enterprise based on the provided enterprise DTO.
     *
     * @param enterpriseDTO The DTO containing the data for the new enterprise.
     * @return The newly created enterprise entity.
     */
    EnterpriseDTO saveEnterprise(EnterpriseDTO enterpriseDTO);

    /**
     * Updates an existing enterprise with the specified ID based on the provided enterprise DTO.
     *
     * @param id The ID of the enterprise to update.
     * @param enterpriseDTO The DTO containing the updated data for the enterprise.
     * @return The updated enterprise entity.
     */
    EnterpriseDTO updateEnterprise(Integer id, EnterpriseDTO enterpriseDTO);

    /**
     * Finds an enterprise by its ID.
     *
     * @param id The ID of the enterprise to find.
     * @return The enterprise entity with the specified ID, or null if not found.
     */
    EnterpriseDTO findById (Integer id);

    /**
     * Finds enterprises whose name contains the specified search string, ignoring case.
     *
     * @param search The search string to match against enterprise names.
     * @return A list of enterprises containing the search string in their names, ignoring case.
     */
    List<EnterpriseDTO> findByNameContainingIgnoreCase (String search);

}
