package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.LanguageDto;
import com.nocountry.professionalIT.entities.LanguageEntity;
import com.nocountry.professionalIT.mapper.LanguageMapper;
import com.nocountry.professionalIT.repository.LanguageRepository;
import com.nocountry.professionalIT.service.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing languages.
 * This class provides methods for retrieving, creating, updating, and deleting languages.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class LanguageServiceImpl implements LanguageService {

    private final LanguageRepository repository;
    private final LanguageMapper mapper;

    /**
     * Retrieves a list of all languages.
     *
     * @return A list of LanguageDto objects representing languages.
     */
    @Override
    @Transactional(readOnly = true)
    public List<LanguageDto> languagesList() {
        List<LanguageEntity> languageList = repository.findAll();
        return languageList.stream().map(mapper::toDto).toList();
    }

    /**
     * Retrieves a language by its unique identifier.
     *
     * @param id The unique identifier of the language.
     * @return An Optional containing the LanguageDto if found, otherwise empty.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<LanguageDto> findById(Integer id) {
        return repository.findById(id).map(mapper::toDto);
    }

    /**
     * Saves a new language.
     *
     * @param language The LanguageDto object to be saved.
     * @return The saved LanguageDto.
     */
    @Override
    @Transactional
    public LanguageDto save(LanguageDto language) {
        LanguageEntity languageSaved=mapper.toEntity(language);
        repository.save(languageSaved);
        return mapper.toDto(languageSaved);
    }

    /**
     * Updates an existing language by its unique identifier.
     *
     * @param id       The unique identifier of the language to be updated.
     * @param language The updated LanguageDto.
     * @return The updated LanguageDto if found, otherwise null.
     * @throws RuntimeException if the language with the specified id is not found.
     */
    @Override
    public LanguageDto update(Integer id, LanguageDto language) {
        Optional<LanguageEntity> languageOptional = Optional.ofNullable(repository.findById(id).orElseThrow(() ->
                new RuntimeException("Language not found with id: " + id)));
        if (languageOptional.isPresent()) {
            LanguageEntity toUpdate = languageOptional.get();
            toUpdate.setName(mapper.toEntity(language).getName());
            return mapper.toDto(repository.save(toUpdate));
    }
        return null;
    }

    /**
     * Deletes a language by its unique identifier.
     *
     * @param id The unique identifier of the language to be deleted.
     */
    @Override
    @Transactional
    public void deleteById(Integer id) {
        repository.deleteById(id);

    }
}
