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

@RequiredArgsConstructor
@Service
public class AvailabilityServiceImpl implements AvailabilityService {

    private final AvailabilityRepository repository;
    private final AvailabilityMapper mapper;
    @Override
    public List<AvailabilityDto> availabilityList() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public Optional<AvailabilityDto> findById(Integer id) {
        return repository.findById(id).map(mapper::toDto);
    }

    @Override
    public AvailabilityDto save(AvailabilityDto availability) {
        AvailabilityEntity tosave = mapper.toEntity(availability);
        repository.save(tosave);
        return mapper.toDto(tosave);
    }

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

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
