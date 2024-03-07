package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.ProfessionalEntityDto;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import com.nocountry.professionalIT.mapper.ProfessionalMapper;
import com.nocountry.professionalIT.repository.ProfessionalRepository;
import com.nocountry.professionalIT.service.FilterService;
import com.nocountry.professionalIT.specification.ProfessionalSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FilterServiceImpl implements FilterService {

    private final  ProfessionalRepository repository;

    public List<ProfessionalEntity> getProfessionalsWithFilters(

            List<Integer> hardSkillIds,
            List<Integer> softSkillIds,
            List<Integer> workModeIds,
            Boolean hasAvailInmediate,
            Boolean hasAvailTravel,
            List<Integer> fieldIds,
            List<String> seniorities,
            List<Integer> knowLanguageList,
            Integer countryId,
            Integer provinceId,
            Integer localityId) {

        Specification<ProfessionalEntity> specification = ProfessionalSpecification.buildDynamicFilters(
                hardSkillIds,softSkillIds, workModeIds, hasAvailInmediate, hasAvailTravel, fieldIds, seniorities, knowLanguageList, countryId, provinceId, localityId);

        return repository.findAll(specification).stream().toList();
    }
}
