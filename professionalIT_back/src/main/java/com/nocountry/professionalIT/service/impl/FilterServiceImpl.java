package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.entities.ProfessionalEntity;
import com.nocountry.professionalIT.repository.ProfessionalRepository;
import com.nocountry.professionalIT.specification.ProfessionalSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FilterServiceImpl {

    private final  ProfessionalRepository repository;

    public List<ProfessionalEntity> getProfessionalsWithFilters(
            List<Integer> skillIds,
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
                skillIds, workModeIds, hasAvailInmediate, hasAvailTravel, fieldIds, seniorities, knowLanguageList, countryId, provinceId, localityId);

        return repository.findAll(specification);
    }
}
