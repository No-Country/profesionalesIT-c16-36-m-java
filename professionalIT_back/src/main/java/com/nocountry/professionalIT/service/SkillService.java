package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.SkillEntity;

import java.util.List;
import java.util.Optional;

public interface SkillService {
    List<SkillEntity> skillList();

    Optional<SkillEntity> findById(Integer id);

    Optional<SkillEntity> findBySkill(String skill);
    SkillEntity save(SkillEntity skill);
    void deleteById (Integer id);
}
