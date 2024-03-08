package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.CompanyDto;
import java.util.List;
import java.util.Optional;

/**
 * Service class for the company entity.
 * This class is responsible for handling the business logic for the company entity.
 *
 * @ Claudia Ortiz
 * @ version 1.0
 * @ since 2024-07-01
 *
 */
public interface CompanyService {

    /**
     * Retrieves a list of all companies.
     *
     * @return A list of CompanyDto objects representing companies.
     */
    List<CompanyDto> companyList();

    /**
     * Retrieves a company by its unique identifier.
     *
     * @param id The unique identifier of the company.
     * @return An Optional containing the CompanyDto if found, otherwise empty.
     */

    Optional<CompanyDto> findById(Integer id);

    /**
     * Saves a new company.
     *
     * @param company The CompanyDto object to be saved.
     * @return The saved CompanyDto.
     */

    CompanyDto save(CompanyDto company);

    /**
     * Updates an existing company.
     *
     * @param id    The unique identifier of the company to be updated.
     * @param company The updated CompanyDto object.
     * @return The updated CompanyDto.
     */

    CompanyDto update(Integer id, CompanyDto company);

    /**
     * Deletes a company by its unique identifier.
     *
     * @param id The unique identifier of the company to be deleted.
     */

    void deleteById (Integer id);

}
