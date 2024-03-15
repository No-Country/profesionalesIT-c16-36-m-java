package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.HSDto;
import com.nocountry.professionalIT.entities.HSEntity;
import com.nocountry.professionalIT.mapper.HSMapper;
import com.nocountry.professionalIT.repository.HSRepository;
import com.nocountry.professionalIT.service.HSService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing hard skills.
 * This class provides methods for retrieving, creating, updating, and deleting hard skills.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class HSServiceImpl implements HSService {

    private final HSRepository hsRepository;
    private final HSMapper mapper;

    /**
     * Retrieves a list of all hard skills.
     * @return A list of HSDto objects representing hard skills.
     */
    @Override
    public List<HSDto> skillList() {
        List<HSEntity> hsList= hsRepository.findAll();
        return hsList.stream().map(mapper::toDto).toList();
    }

    /**
     * Retrieves a hard skill by its unique identifier.
     * @param id The unique identifier of the hard skill.
     * @return An Optional containing the HSDto if found, otherwise empty.
     */
    @Override
    public Optional<HSDto> findById(Integer id) {

        return hsRepository.findById(id).map(mapper::toDto);
    }

    /**
     * Saves a new hard skill.
     * @param skill The HSDto object to be saved.
     * @return The saved HSDto.
     */
    @Override
    public HSDto save(HSDto skill) {
        HSEntity hsEntity = mapper.toEntity(skill);
        hsEntity = hsRepository.save(hsEntity);
        return mapper.toDto(hsEntity);
    }

    /**
     * Updates an existing hard skill.
     * @param id The unique identifier of the hard skill to be updated.
     * @param skill The HSDto object containing the new data.
     * @return The updated HSDto.
     */
    @Override
    public HSDto update(Integer id, HSDto skill) {
        Optional<HSEntity> optional = Optional.ofNullable(hsRepository.findById(id).orElseThrow(()->new RuntimeException("Hard skill not found with id: "+ id )));
        if (optional.isPresent()) {
            HSEntity toSave = optional.get();
            toSave.setName(skill.getName());
            toSave = hsRepository.save(toSave);
            return mapper.toDto(toSave);
        }
        return null;
    }

    /**
     * Deletes a hard skill by its unique identifier.
     * @param id The unique identifier of the hard skill to be deleted.
     */
    @Override
    public void deleteById(Integer id) {
        hsRepository.deleteById(id);
    }
}
