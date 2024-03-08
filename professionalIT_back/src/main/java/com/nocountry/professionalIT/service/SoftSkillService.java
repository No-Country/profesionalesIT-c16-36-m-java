package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.SoftSkillsDto;

import java.util.List;
import java.util.Optional;


public interface SoftSkillService {

    List<SoftSkillsDto> softSkillList();

    Optional<SoftSkillsDto> findById(Integer id);


    SoftSkillsDto save(SoftSkillsDto softSkill);

    SoftSkillsDto update(Integer id, SoftSkillsDto softSkill);

    void deleteById (Integer id);

}
