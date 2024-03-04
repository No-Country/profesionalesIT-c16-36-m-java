package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.WorkExperienceDto;
import com.nocountry.professionalIT.entities.WorkExperienceEntity;
import com.nocountry.professionalIT.mapper.WorkExperienceMapper;
import com.nocountry.professionalIT.repository.WorkExperienceRepository;
import com.nocountry.professionalIT.service.WorkExperienceService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;


/**
 * Service implementation for managing work experiences.
 * This class provides methods for retrieving, creating, updating, and deleting work experiences.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class WorkExpServiceImpl implements WorkExperienceService {

    private final WorkExperienceRepository repository;
    private final WorkExperienceMapper mapper;

    /**
     * Retrieves a list of all work experiences.
     *
     * @return A list of WorkExperienceDto objects representing work experiences.
     */
    @Override
    @Transactional(readOnly = true)
    public List<WorkExperienceDto> workExperienceList() {
        List< WorkExperienceEntity> workExperienceList = repository.findAll();
        return workExperienceList.stream().map(mapper::toDto).toList();
    }

    /**
     * Retrieves a work experience by its unique identifier.
     *
     * @param id The unique identifier of the work experience.
     * @return An Optional containing the WorkExperienceDto if found, otherwise empty.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<WorkExperienceDto> findById(Integer id) {
        return repository.findById(id).map(mapper::toDto);
    }


    /**
     * Saves a new work experience.
     *
     * @param workExperience The WorkExperienceDto object to be saved.
     * @return The saved WorkExperienceDto.
     */
    @Override
    @Transactional
    public WorkExperienceDto save(WorkExperienceDto workExperience) {
        WorkExperienceEntity saved=mapper.toEntity(workExperience);
        return mapper.toDto(repository.save(saved));
    }

    /**
     * Updates an existing work experience by its unique identifier.
     *
     * @param id               The unique identifier of the work experience to be updated.
     * @param workExperienceDto The updated WorkExperienceDto.
     * @return The updated WorkExperienceDto if found, otherwise null.
     * @throws RuntimeException if the work experience with the specified id is not found.
     */
    @Override
    public WorkExperienceDto update(Integer id, WorkExperienceDto workExperienceDto) {
        Optional<WorkExperienceEntity> optional = Optional.ofNullable(repository.findById(id).orElseThrow(()
                -> new EntityNotFoundException("Work Experience not found with id: " + id)));
        if (optional.isPresent()) {
            WorkExperienceEntity toUpdate = optional.get();
            toUpdate.setStatus(workExperienceDto.getStatus());
            toUpdate.setCompany(mapper.toEntity(workExperienceDto).getCompany());
            toUpdate.setPosition(workExperienceDto.getPosition());
            toUpdate.setDescription(workExperienceDto.getDescription());
            toUpdate.setStartDate(workExperienceDto.getStartDate());
            toUpdate.setEndDate(workExperienceDto.getEndDate());
            toUpdate.setWorkExperience(workExperienceDto.getWorkExperience());

            return mapper.toDto(repository.save(toUpdate));
        }
        return null;
    }

    /**
     * Deletes a work experience by its unique identifier.
     *
     * @param id The unique identifier of the work experience to be deleted.
     */
    @Override
    @Transactional
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
