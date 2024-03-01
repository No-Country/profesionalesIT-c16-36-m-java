package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.FieldEntity;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

public interface FieldService {

    List<FieldEntity> fieldList();

    Optional<FieldEntity> findById(Integer id);

    Optional<FieldEntity> byFieldName(String fieldName);

    FieldEntity save(Field field);

    void deleteById (Integer id);

}
