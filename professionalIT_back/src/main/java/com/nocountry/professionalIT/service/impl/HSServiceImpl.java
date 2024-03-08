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

@Service
@RequiredArgsConstructor
public class HSServiceImpl implements HSService {

    private final HSRepository hsRepository;
    private final HSMapper mapper;


    @Override
    public List<HSDto> skillList() {
        List<HSEntity> hsList= hsRepository.findAll();
        return hsList.stream().map(mapper::toDto).toList();
    }

    @Override
    public Optional<HSDto> findById(Integer id) {

        return hsRepository.findById(id).map(mapper::toDto);
    }

    @Override
    public HSDto save(HSDto skill) {
        HSEntity hsEntity = mapper.toEntity(skill);
        hsEntity = hsRepository.save(hsEntity);
        return mapper.toDto(hsEntity);
    }

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
    @Override
    public void deleteById(Integer id) {
        hsRepository.deleteById(id);
    }
}
