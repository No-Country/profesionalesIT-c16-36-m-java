package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.WorkModeDto;
import com.nocountry.professionalIT.entities.WorkModeEntity;
import com.nocountry.professionalIT.mapper.WorkModeMapper;
import com.nocountry.professionalIT.repository.WorkModeRepository;
import com.nocountry.professionalIT.service.WorkModeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing work modes.
 * This class provides methods for retrieving, creating, updating, and deleting work modes.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class WorkModeImpl implements WorkModeService {

    private final WorkModeRepository repository;
    private final WorkModeMapper mapper;

    /**
     * Retrieves a list of all work modes.
     *
     * @return A list of WorkModeDto objects representing work modes.
     */
    @Override
    @Transactional(readOnly = true)
    public List<WorkModeDto> workModeList() {
        List<WorkModeEntity> workModeList = repository.findAll();
        return workModeList.stream().map(mapper::toDto).toList();
    }


    /**
     * Retrieves a work mode by its unique identifier.
     *
     * @param id The unique identifier of the work mode.
     * @return An Optional containing the WorkModeDto if found, otherwise empty.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<WorkModeDto> findById(Integer id) {
        return repository.findById(id).map(mapper::toDto);
    }

    /**
     * Saves a new work mode.
     *
     * @param workMode The WorkModeDto object to be saved.
     * @return The saved WorkModeDto.
     */
    @Override
    @Transactional
    public WorkModeDto save(WorkModeDto workMode) {
        WorkModeEntity workModeSaved=mapper.toEntity(workMode);
        repository.save(workModeSaved);
        return mapper.toDto(workModeSaved);
    }

    /**
     * Updates an existing work mode by its unique identifier.
     *
     * @param id           The unique identifier of the work mode to be updated.
     * @param workModeDto  The updated WorkModeDto.
     * @return The updated WorkModeDto if found, otherwise null.
     * @throws RuntimeException if the work mode with the specified id is not found.
     */
    @Override
    @Transactional
    public WorkModeDto update(Integer id, WorkModeDto workModeDto) {
        Optional<WorkModeEntity> optional = Optional.ofNullable(repository.findById(id).orElseThrow(() -> new EntityNotFoundException("WorkMode not found with id: " + id)));

        if (optional.isPresent()) {
            WorkModeEntity toUpdate = optional.get();
            toUpdate.setMode(mapper.toEntity(workModeDto).getMode());

            return mapper.toDto(repository.save(toUpdate));
        }

        return null;
    }

    /**
     * Deletes a work mode by its unique identifier.
     *
     * @param id The unique identifier of the work mode to be deleted.
     */
    @Override
    @Transactional
    public void deleteById(Integer id) {
        repository.deleteById(id);
        }
}
