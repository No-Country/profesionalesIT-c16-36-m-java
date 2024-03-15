package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.SSDto;
import com.nocountry.professionalIT.entities.SSEntity;
import com.nocountry.professionalIT.mapper.SSMapper;
import com.nocountry.professionalIT.repository.SSRepository;
import com.nocountry.professionalIT.service.SSService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing soft skills.
 * This class provides methods for retrieving, creating, updating, and deleting soft skills.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class SsServiceImpl implements SSService {

    private final SSRepository ssRepository;
    private final SSMapper mapper;

    /**
     * Retrieves a list of all soft skills.
     * @return A list of SSDto objects representing soft skills.
     */
    @Override
    public List<SSDto> skillList() {
        List<SSEntity> ssList= ssRepository.findAll();
        return ssList.stream().map(mapper::toDto).toList();
    }

    /**
     * Retrieves a soft skill by its unique identifier.
     * @param id The unique identifier of the soft skill.
     * @return An Optional containing the SSDto if found, otherwise empty.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<SSDto> findById(Integer id) {
        return ssRepository.findById(id).map(mapper::toDto);
    }

    /**
     * Saves a new soft skill.
     * @param ssDto The SSDto object to be saved.
     * @return The saved SSDto.
     */
    @Override
    public SSDto save(SSDto ssDto) {
        SSEntity ssEntity = mapper.toEntity(ssDto);
        ssEntity = ssRepository.save(ssEntity);
        return mapper.toDto(ssEntity);
    }

    /**
     * Updates an existing soft skill.
     * @param id    The unique identifier of the soft skill to be updated.
     * @param skill The updated SSDto object.
     * @return The updated SSDto.
     */
    @Override
    public SSDto update(Integer id, SSDto skill) {
        Optional<SSEntity> optional = Optional.ofNullable(ssRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Soft skill not found")))  ;
        if (optional.isPresent()) {
            SSEntity toSave = optional.get();
            toSave.setName(skill.getName());
            toSave = ssRepository.save(toSave);
            return mapper.toDto(toSave);
        }
        return null;
    }

    /**
     * Deletes a soft skill by its unique identifier.
     * @param id The unique identifier of the soft skill to be deleted.
     */
    @Override
    public void deleteById(Integer id) {
        ssRepository.deleteById(id);

    }

}
