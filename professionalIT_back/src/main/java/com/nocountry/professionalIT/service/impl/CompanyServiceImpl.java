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

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository repository;
    private final CompanyMapper mapper;
    @Override
    public List<CompanyDto> companyList() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public Optional<CompanyDto> findById(Integer id) {
        return repository.findById(id).map(mapper::toDto);

    }

    @Override
    public CompanyDto save(CompanyDto company) {
        CompanyEntity tosave = mapper.toEntity(company);
        repository.save(tosave);
        return mapper.toDto(tosave);
    }

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

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
