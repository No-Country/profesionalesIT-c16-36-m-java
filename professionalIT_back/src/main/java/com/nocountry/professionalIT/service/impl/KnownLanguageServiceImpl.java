package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.KnownLanguageDto;
import com.nocountry.professionalIT.entities.KnowLanguageEntity;
import com.nocountry.professionalIT.mapper.KnownLanguageMapper;
import com.nocountry.professionalIT.repository.KnownLanguageRepository;
import com.nocountry.professionalIT.service.KnownLanguageService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
/**
 * Service implementation for managing known languages.
 * This class provides methods for retrieving, creating, updating, and deleting known languages.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class KnownLanguageServiceImpl implements KnownLanguageService{

    private final KnownLanguageRepository repository;
    private final KnownLanguageMapper mapper;

    /**
     * Retrieves a list of all known languages.
     *
     * @return A list of KnownLanguageDto objects representing known languages.
     */
    @Override
    @Transactional(readOnly = true)
    public List<KnownLanguageDto> KnownLanguageList() {
        List<KnowLanguageEntity> knownLanguageList = repository.findAll();
        return knownLanguageList.stream().map(mapper::toDto).toList();
    }

    /**
     * Retrieves a known language by its unique identifier.
     *
     * @param id The unique identifier of the known language.
     * @return An Optional containing the KnownLanguageDto if found, otherwise empty.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<KnownLanguageDto> findById(Integer id) {
        return repository.findById(id).map(mapper::toDto);
    }

    /**
     * Saves a new known language.
     *
     * @param KnownLanguageDto The KnownLanguageDto object to be saved.
     * @return The saved KnownLanguageDto.
     */
    @Override
    @Transactional
    public KnownLanguageDto save(KnownLanguageDto KnownLanguageDto) {
        KnowLanguageEntity entity = mapper.toEntity(KnownLanguageDto);
        return mapper.toDto(repository.save(entity));
    }

    /**
     * Updates an existing known language by its unique identifier.
     *
     * @param id               The unique identifier of the known language to be updated.
     * @param knownLanguageDto The updated KnownLanguageDto.
     * @return The updated KnownLanguageDto if found, otherwise null.
     * @throws EntityNotFoundException if the known language with the specified id is not found.
     */
    @Override
    @Transactional
    public KnownLanguageDto update(Integer id, KnownLanguageDto knownLanguageDto) {
        Optional<KnowLanguageEntity> knownLanguageOptional = Optional.ofNullable(repository.findById(id).orElseThrow(()->
                new EntityNotFoundException("Known language not found with id: " + id)));

        if (knownLanguageOptional.isPresent()){
            KnowLanguageEntity updated = knownLanguageOptional.get();
            updated.setLanguage(mapper.toEntity(knownLanguageDto).getLanguage());
            updated.setLevel(mapper.toEntity(knownLanguageDto).getLevel());
            return mapper.toDto(repository.save(updated));
            }
        return null;
    }

    /**
     * Deletes a known language by its unique identifier.
     *
     * @param id The unique identifier of the known language to be deleted.
     */
    @Override
    @Transactional
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
