package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.FieldDto;
import com.nocountry.professionalIT.entities.FieldEntity;
import com.nocountry.professionalIT.mapper.FieldMapper;
import com.nocountry.professionalIT.repository.FieldRepository;
import com.nocountry.professionalIT.service.FieldService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing fields.
 * This class provides methods for retrieving, creating, updating, and deleting fields.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class FieldServiceImpl implements FieldService {

    private final FieldRepository fieldRepository;
    private final FieldMapper fieldMapper;

    /**
     * Retrieves a list of all fields.
     *
     * @return A list of FieldDto objects representing fields.
     */
    @Override
    @Transactional(readOnly = true)
    public List<FieldDto> fieldList() {
        List<FieldEntity> fieldEntities = fieldRepository.findAll();
        return fieldEntities.stream().map(fieldMapper::toDto).toList();
    }

    /**
     * Retrieves a field by its unique identifier.
     *
     * @param id The unique identifier of the field.
     * @return An Optional containing the FieldDto if found, otherwise empty.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<FieldDto> findById(Integer id) {
        return fieldRepository.findById(id).map(fieldMapper::toDto);
    }

    /**
     * Saves a new field.
     *
     * @param field The FieldDto object to be saved.
     * @return The saved FieldDto.
     */
    @Override
    @Transactional
    public FieldDto save(FieldDto field) {
        FieldEntity fieldEntity = fieldMapper.toEntity(field);
        fieldRepository.save(fieldEntity);
        return fieldMapper.toDto(fieldEntity);
    }

    /**
     * Updates an existing field by its unique identifier.
     *
     * @param id    The unique identifier of the field to be updated.
     * @param field The updated FieldDto.
     * @return The updated FieldDto if found, otherwise null.
     * @throws EntityNotFoundException if the field with the specified id is not found.
     */
    @Override
    @Transactional
    public FieldDto update(Integer id, FieldDto field) {
        Optional<FieldEntity> fieldOptional = Optional.ofNullable(fieldRepository.findById(id).orElseThrow(() -> new
                EntityNotFoundException("Field not found with id: " + id)));
        if(fieldOptional.isPresent()) {
            FieldEntity updatedField = fieldOptional.get();
            updatedField.setName(field.getName());
            return fieldMapper.toDto(fieldRepository.save(updatedField));
        }
        return null;
    }

    /**
     * Deletes a field by its unique identifier.
     *
     * @param id The unique identifier of the field to be deleted.
     */
    @Override
    @Transactional
    public void deleteById(Integer id) {
        fieldRepository.deleteById(id);
    }
}
