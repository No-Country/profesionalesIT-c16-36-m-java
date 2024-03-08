package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.HardSkillsDto;
import com.nocountry.professionalIT.entities.HardSkillsEntity;
import com.nocountry.professionalIT.mapper.HardSkillsMapper;
import com.nocountry.professionalIT.repository.HardSkillsRepository;
import com.nocountry.professionalIT.service.HardSkillsService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing hard skills.
 * This class provides methods for retrieving, creating, updating, and deleting hard skills.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class HardSkillServiceImpl implements HardSkillsService {

    private final HardSkillsRepository repository;
    private final HardSkillsMapper mapper;

    /**
     * Retrieves a list of all hard skills.
     *
     * @return A list of HardSkillDto objects representing hard skills.
     */
    @Override
    @Transactional(readOnly = true)
    public List<HardSkillsDto> hardSkillList() {
        List<HardSkillsEntity> hardSkillList = repository.findAll();
        return hardSkillList.stream().map(mapper::toDto).toList();
    }

    /**
     * Retrieves a hard skill by its unique identifier.
     *
     * @param id The unique identifier of the hard skill.
     * @return An Optional containing the HardSkillDto if found, otherwise empty.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<HardSkillsDto> findById(Integer id) {
        return repository.findById(id).map(mapper::toDto);
    }

    /**
     * Saves a new hard skill.
     *
     * @param hardSkill The HardSkillDto object to be saved.
     * @return The saved HardSkillDto.
     */
    @Transactional
    @Override
    public HardSkillsDto save(HardSkillsDto hardSkill) {
        HardSkillsEntity hardSkillsSaved=mapper.toEntity(hardSkill);
        return mapper.toDto(repository.save(hardSkillsSaved));
    }

    /**
     * Updates an existing hard skill by its unique identifier.
     *
     * @param id        The unique identifier of the hard skill to be updated.
     * @param hardSkill The updated HardSkillDto.
     * @return The updated HardSkillDto if found, otherwise null.
     * @throws EntityNotFoundException if the hard skill with the specified id is not found.
     */
    @Override
    @Transactional
    public HardSkillsDto update(Integer id, HardSkillsDto hardSkill) {
        Optional<HardSkillsEntity> hardSkillOptional = Optional.ofNullable(repository
                .findById(id).orElseThrow(() -> new EntityNotFoundException("Hard skill not found with id: " + id)));

        if (hardSkillOptional.isPresent()) {
            HardSkillsEntity toUpdate = hardSkillOptional.get();
            toUpdate.setHs(mapper.toEntity(hardSkill).getHs());
            return mapper.toDto(repository.save(toUpdate));
        }
        return null;
    }

    /**
     * Deletes a hard skill by its unique identifier.
     *
     * @param id The unique identifier of the hard skill to be deleted.
     */
    @Transactional
    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);

    }
}
