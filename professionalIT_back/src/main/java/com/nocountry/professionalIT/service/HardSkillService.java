package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.FieldEntity;
import com.nocountry.professionalIT.entities.HardSkillEntity;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

public interface HardSkillService {
    List<HardSkillEntity> hardSkillList();

    Optional<HardSkillEntity> findById(Integer id);

    Optional<HardSkillEntity> byHardSkillName(String hardSkillName);

    HardSkillEntity save(HardSkillEntity hardSkill);
    void deleteById (Integer id);

}
