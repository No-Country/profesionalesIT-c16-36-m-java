package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.HSDto;
import java.util.List;
import java.util.Optional;

public interface HSService {

        List<HSDto> skillList();

        Optional<HSDto> findById(Integer id);

        HSDto save(HSDto skill);

        HSDto update(Integer id, HSDto skill);

        void deleteById(Integer id);
}

