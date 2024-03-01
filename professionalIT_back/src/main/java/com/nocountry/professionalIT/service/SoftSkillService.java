package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.HardSkillEntity;
import com.nocountry.professionalIT.entities.SoftSkillEntity;

import java.util.List;
import java.util.Optional;

public interface SoftSkillService {

    List<SoftSkillEntity> softSkillList();

    Optional<SoftSkillEntity> findById(Integer id);

    Optional<SoftSkillEntity> bySoftSkillName(String softSkillName);

    SoftSkillEntity save(SoftSkillEntity hardSkill);
    void deleteById (Integer id);

}
