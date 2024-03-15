package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.CompanyDto;
import com.nocountry.professionalIT.entities.CompanyEntity;
import com.nocountry.professionalIT.mapper.CompanyMapper;
import com.nocountry.professionalIT.repository.CompanyRepository;
import com.nocountry.professionalIT.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing companies.
 * This class provides methods for retrieving, creating, updating, and deleting companies.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository repository;
    private final CompanyMapper mapper;

    /**
     * Retrieves a list of all companies.
     * @return A list of CompanyDto objects representing companies.
     */
    @Override
    public List<CompanyDto> companyList() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    /**
     * Retrieves a company by its unique identifier.
     * @param id The unique identifier of the company.
     * @return An Optional containing the CompanyDto if found, otherwise empty.
     */
    @Override
    public Optional<CompanyDto> findById(Integer id) {
        return repository.findById(id).map(mapper::toDto);

    }

    /**
     * Saves a new company.
     * @param company The CompanyDto object to be saved.
     * @return The saved CompanyDto.
     */
    @Override
    public CompanyDto save(CompanyDto company) {
        CompanyEntity tosave = mapper.toEntity(company);
        repository.save(tosave);
        return mapper.toDto(tosave);
    }

    /**
     * Updates an existing company.
     * @param id The unique identifier of the company to be updated.
     * @param company The CompanyDto object containing the updated information.
     * @return The updated CompanyDto.
     */
    @Override
    public CompanyDto update(Integer id, CompanyDto company) {
        Optional<CompanyEntity> optional = Optional.ofNullable(repository.findById(id).orElseThrow(()->
                new RuntimeException("Company not found with id: " + id)));
        if(optional.isPresent()) {
            CompanyEntity updated = optional.get();
            updated.setName(company.getName());
            return mapper.toDto(repository.save(updated));

        }
        return null;
    }

    /**
     * Deletes a company by its unique identifier.
     * @param id The unique identifier of the company to be deleted.
     */
    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
