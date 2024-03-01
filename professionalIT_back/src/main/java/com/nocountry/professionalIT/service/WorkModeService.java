package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.WorkExperienceEntity;
import com.nocountry.professionalIT.entities.WorkModeEntity;

import java.util.List;
import java.util.Optional;

public interface WorkModeService {
    List<WorkModeEntity> workModeList();

    Optional<WorkModeEntity> findById(Integer id);

    Optional<WorkModeEntity> byWorkExperience(String workMode);
    WorkModeEntity save(WorkModeEntity workMode);
    void deleteById (Integer id);
}
