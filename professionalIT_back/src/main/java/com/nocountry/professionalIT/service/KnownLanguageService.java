package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.KnowLanguageEntity;

import java.util.List;
import java.util.Optional;

public interface KnownLanguageService {
    List<KnowLanguageEntity> KnownLanguageList();

    Optional<KnowLanguageEntity> findById(Integer id);

    Optional<KnowLanguageEntity> byLanguage(String Language);

    KnowLanguageEntity save(KnowLanguageEntity knownLanguage);
    void deleteById (Integer id);
}
