package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.KnowLanguageEntity;
import com.nocountry.professionalIT.entities.LanguageEntity;

import java.util.List;
import java.util.Optional;

public interface LanguageService {
    List<LanguageEntity> languagesList();

    Optional<LanguageEntity> findById(Integer id);

    LanguageEntity save(LanguageEntity Language);
    void deleteById (Integer id);
}
