package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.HardSkillsDto;

import java.util.List;
import java.util.Optional;

public interface HardSkillsService {

    List<HardSkillsDto> hardSkillList();


    Optional<HardSkillsDto> findById(Integer id);

    HardSkillsDto save(HardSkillsDto hardSkill);

    HardSkillsDto update(Integer id, HardSkillsDto hardSkill);


    void deleteById (Integer id);

}
