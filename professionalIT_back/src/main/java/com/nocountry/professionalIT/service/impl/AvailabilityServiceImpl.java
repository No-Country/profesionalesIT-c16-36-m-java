package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.AvailabilityDto;
import com.nocountry.professionalIT.entities.AvailabilityEntity;
import com.nocountry.professionalIT.mapper.AvailabilityMapper;
import com.nocountry.professionalIT.repository.AvailabilityRepository;
import com.nocountry.professionalIT.service.AvailabilityService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * Service implementation for managing availability.
 * This class provides methods for retrieving, creating, updating, and deleting availability.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@RequiredArgsConstructor
@Service
public class AvailabilityServiceImpl implements AvailabilityService {

    private final AvailabilityRepository repository;
    private final AvailabilityMapper mapper;

    /**
     * Retrieves a list of all availability.
     * @return A list of AvailabilityDto objects representing availability.
     */
    @Override
    public List<AvailabilityDto> availabilityList() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    /**
     * Retrieves availability by its unique identifier.
     * @param id The unique identifier of the availability.
     * @return An Optional containing the AvailabilityDto if found, otherwise empty.
     */
    @Override
    public Optional<AvailabilityDto> findById(Integer id) {
        return repository.findById(id).map(mapper::toDto);
    }

    /**
     * Saves new availability.
     * @param availability The AvailabilityDto object to be saved.
     * @return The saved AvailabilityDto.
     */
    @Override
    public AvailabilityDto save(AvailabilityDto availability) {
        AvailabilityEntity tosave = mapper.toEntity(availability);
        repository.save(tosave);
        return mapper.toDto(tosave);
    }

    /**
     * Updates availability.
     * @param id The unique identifier of the availability to be updated.
     * @param availability The AvailabilityDto object to be updated.
     * @return The updated AvailabilityDto.
     */
    @Override
    public AvailabilityDto update(Integer id, AvailabilityDto availability) {

        Optional<AvailabilityEntity> optional = Optional.ofNullable(repository.findById(id).orElseThrow(()->
                new EntityNotFoundException("Availability not found with id: " + id)));
        if(optional.isPresent()) {
            AvailabilityEntity updated = optional.get();
            updated.setStartTime(availability.getStartTime());
            updated.setEndTime(availability.getEndTime());
            return mapper.toDto(repository.save(updated));
        }
        return null;

    }

    /**
     * Deletes availability by its unique identifier.
     * @param id The unique identifier of the availability to be deleted.
     */
    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
