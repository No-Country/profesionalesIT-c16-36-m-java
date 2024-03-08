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

@Service
@RequiredArgsConstructor
public class SsServiceImpl implements SSService {

    private final SSRepository ssRepository;
    private final SSMapper mapper;


    @Override
    public List<SSDto> skillList() {
        List<SSEntity> ssList= ssRepository.findAll();
        return ssList.stream().map(mapper::toDto).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<SSDto> findById(Integer id) {
        return ssRepository.findById(id).map(mapper::toDto);
    }

    @Override
    public SSDto save(SSDto ssDto) {
        SSEntity ssEntity = mapper.toEntity(ssDto);
        ssEntity = ssRepository.save(ssEntity);
        return mapper.toDto(ssEntity);
    }

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

    @Override
    public void deleteById(Integer id) {
        ssRepository.deleteById(id);

    }

}
