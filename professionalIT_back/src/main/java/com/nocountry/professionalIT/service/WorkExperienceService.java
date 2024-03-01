package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.KnowLanguageEntity;
import com.nocountry.professionalIT.entities.WorkExperienceEntity;

import java.util.List;
import java.util.Optional;

public interface WorkExperienceService {

    List<WorkExperienceEntity> workExperienceList();

    Optional<WorkExperienceEntity> findById(Integer id);

    Optional<WorkExperienceEntity> byWorkExperience(String workExperience);

    WorkExperienceEntity save(WorkExperienceEntity workExperience);
    void deleteById (Integer id);
}
