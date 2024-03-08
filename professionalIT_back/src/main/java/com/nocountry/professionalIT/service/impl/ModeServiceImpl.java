package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.ModeDto;
import com.nocountry.professionalIT.entities.ModeEntity;
import com.nocountry.professionalIT.mapper.ModeMapper;
import com.nocountry.professionalIT.repository.ModeRepository;
import com.nocountry.professionalIT.service.ModeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing modes.
 * This class provides methods for retrieving, creating, updating, and deleting modes.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class ModeServiceImpl implements ModeService {

    private final ModeRepository repository;
    private final ModeMapper mapper;

    /**
     * Retrieves a list of all modes.
     *
     * @return A list of ModeDto objects representing modes.
     */
    @Override
    @Transactional(readOnly = true)
    public List<ModeDto> modeList() {
        List<ModeEntity> modes=repository.findAll();
        return modes.stream().map(mapper::toDto).toList();
    }

    /**
     * Retrieves a mode by its unique identifier.
     *
     * @param id The unique identifier of the mode.
     * @return An Optional containing the ModeDto if found, otherwise empty.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<ModeDto> findById(Integer id) {
        return repository.findById(id).map(mapper::toDto);
    }

    /**
     * Saves a new mode.
     *
     * @param mode The ModeDto object to be saved.
     * @return The saved ModeDto.
     */
    @Override
    @Transactional
    public ModeDto save(ModeDto mode) {
        ModeEntity modeSaved=mapper.toEntity(mode);
        repository.save(modeSaved);
        return mapper.toDto(modeSaved);
    }

    /**
     * Updates an existing mode by its unique identifier.
     *
     * @param id   The unique identifier of the mode to be updated.
     * @param mode The updated ModeDto.
     * @return The updated ModeDto if found, otherwise null.
     * @throws RuntimeException if the mode with the specified id is not found.
     */
    @Override
    @Transactional
    public ModeDto update(Integer id, ModeDto mode) {
        Optional<ModeEntity> modeOptional = Optional.ofNullable(repository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Mode not found with id: " + id)));
        if (modeOptional.isPresent()) {
            ModeEntity toUpdate = modeOptional.get();
            toUpdate.setName(mode.getName());
            repository.save(toUpdate);
            return mapper.toDto(toUpdate);
        }
        return null;
    }

    /**
     * Deletes a mode by its unique identifier.
     *
     * @param id The unique identifier of the mode to be deleted.
     */
    @Override
    @Transactional
    public void deleteById(Integer id) {
        repository.deleteById(id);

    }
}
