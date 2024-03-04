package com.nocountry.professionalIT.service.impl;


import com.nocountry.professionalIT.dto.HardSkillDto;
import com.nocountry.professionalIT.entities.HardSkillEntity;
import com.nocountry.professionalIT.mapper.HardSkillMapper;
import com.nocountry.professionalIT.repository.HardSkillRepository;
import com.nocountry.professionalIT.service.HardSkillService;
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
public class HardSkillServiceImpl implements HardSkillService {

    private final HardSkillRepository repository;
    private final HardSkillMapper mapper;

    /**
     * Retrieves a list of all hard skills.
     *
     * @return A list of HardSkillDto objects representing hard skills.
     */
    @Override
    @Transactional(readOnly = true)
    public List<HardSkillDto> hardSkillList() {
        List<HardSkillEntity> hardSkillList = repository.findAll();
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
    public Optional<HardSkillDto> findById(Integer id) {
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
    public HardSkillDto save(HardSkillDto hardSkill) {
        HardSkillEntity hardSkillSaved=mapper.toEntity(hardSkill);
        return mapper.toDto(repository.save(hardSkillSaved));
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
    public HardSkillDto update(Integer id, HardSkillDto hardSkill) {
        Optional<HardSkillEntity> hardSkillOptional = Optional.ofNullable(repository
                .findById(id).orElseThrow(() -> new EntityNotFoundException("Hard skill not found with id: " + id)));

        if (hardSkillOptional.isPresent()) {
            HardSkillEntity toUpdate = hardSkillOptional.get();
            toUpdate.setName(hardSkill.getName());
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
