package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.SoftSkillsDto;
import com.nocountry.professionalIT.entities.SoftSkillsEntity;
import com.nocountry.professionalIT.mapper.SoftSkillsMapper;
import com.nocountry.professionalIT.repository.SoftSkillsRepository;
import com.nocountry.professionalIT.service.SoftSkillService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing soft skills.
 * This class provides methods for retrieving, creating, updating, and deleting soft skills.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class SoftSkillsServiceImpl implements SoftSkillService {

    private final SoftSkillsRepository repository;
    private final SoftSkillsMapper mapper;

    /**
     * Retrieves a list of all soft skills.
     *
     * @return A list of SoftSkillDto objects representing soft skills.
     */
    @Override
    @Transactional(readOnly = true)
    public List<SoftSkillsDto> softSkillList() {
        List<SoftSkillsEntity> softSkillList = repository.findAll();
        return softSkillList.stream().map(mapper::toDto).toList();
    }

    /**
     * Retrieves a soft skill by its unique identifier.
     *
     * @param id The unique identifier of the soft skill.
     * @return An Optional containing the SoftSkillDto if found, otherwise empty.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<SoftSkillsDto> findById(Integer id) {
        return repository.findById(id).map(mapper::toDto);
    }


    /**
     * Saves a new soft skill.
     *
     * @param softSkill The SoftSkillDto object to be saved.
     * @return The saved SoftSkillDto.
     */
    @Override
    @Transactional
    public SoftSkillsDto save(SoftSkillsDto softSkill) {
        SoftSkillsEntity softSkillSaved=mapper.toEntity(softSkill);
        repository.save(softSkillSaved);
        return mapper.toDto(softSkillSaved);
    }

    /**
     * Updates an existing soft skill by its unique identifier.
     *
     * @param id        The unique identifier of the soft skill to be updated.
     * @param softSkill The updated SoftSkillDto.
     * @return The updated SoftSkillDto if found, otherwise null.
     * @throws RuntimeException if the soft skill with the specified id is not found.
     */
    @Override
    @Transactional
    public SoftSkillsDto update(Integer id, SoftSkillsDto softSkill) {
        Optional<SoftSkillsEntity> softSkillOptional=Optional.ofNullable(repository.findById(id).orElseThrow(()->new EntityNotFoundException("Soft skill not found")));
        if (softSkillOptional.isPresent()){
            SoftSkillsEntity softSkillEntity=softSkillOptional.get();
            softSkillEntity.setSs(mapper.toEntity(softSkill).getSs());
            repository.save(softSkillEntity);
            return mapper.toDto(softSkillEntity);
        }
        return null;
    }

    /**
     * Deletes a soft skill by its unique identifier.
     *
     * @param id The unique identifier of the soft skill to be deleted.
     */
    @Override
    @Transactional
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
