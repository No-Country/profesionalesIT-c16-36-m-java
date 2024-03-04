package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.SkillDto;
import com.nocountry.professionalIT.entities.SkillEntity;
import com.nocountry.professionalIT.mapper.SkillMapper;
import com.nocountry.professionalIT.repository.SkillRepository;
import com.nocountry.professionalIT.service.SkillService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing skills.
 * This class provides methods for retrieving, creating, updating, and deleting skills.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {

    private final SkillRepository repository;
    private final SkillMapper mapper;

    /**
     * Retrieves a list of all skills.
     *
     * @return A list of SkillDto objects representing skills.
     */
    @Override
    @Transactional(readOnly = true)
    public List<SkillDto> skillList() {
        List<SkillEntity> skillList = repository.findAll();
        return skillList.stream().map(mapper::toDto).toList();
    }

    /**
     * Retrieves a skill by its unique identifier.
     *
     * @param id The unique identifier of the skill.
     * @return An Optional containing the SkillDto if found, otherwise empty.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<SkillDto> findById(Integer id) {
        return repository.findById(id).map(mapper::toDto);
    }

    /**
     * Saves a new skill.
     *
     * @param skill The SkillDto object to be saved.
     * @return The saved SkillDto.
     */
    @Override
    @Transactional
    public SkillDto save(SkillDto skill) {
        SkillEntity saved = mapper.toEntity(skill);
        return mapper.toDto(repository.save(saved));
    }

    /**
     * Updates an existing skill by its unique identifier.
     *
     * @param id    The unique identifier of the skill to be updated.
     * @param skill The updated SkillDto.
     * @return The updated SkillDto if found, otherwise null.
     * @throws RuntimeException if the skill with the specified id is not found.
     */
    @Override
    @Transactional
    public SkillDto update(Integer id, SkillDto skill) {
        SkillEntity skillEntity = repository.findById(id)
                .orElseThrow(()  -> new EntityNotFoundException("Skill not found with id: " + id));

        skillEntity.setSoftSkill(mapper.toEntity(skill).getSoftSkill());
        skillEntity.setHardSkill(mapper.toEntity(skill).getHardSkill());

        SkillEntity updated = repository.save(skillEntity);
        return mapper.toDto(updated);
    }

    /**
     * Deletes a skill by its unique identifier.
     *
     * @param id The unique identifier of the skill to be deleted.
     */
    @Override
    @Transactional
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
