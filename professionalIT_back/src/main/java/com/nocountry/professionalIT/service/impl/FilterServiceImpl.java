package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.ProfessionalProfile;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import com.nocountry.professionalIT.mapper.ProfessionalProfileMapper;
import com.nocountry.professionalIT.repository.ProfessionalRepository;
import com.nocountry.professionalIT.service.FilterService;
import com.nocountry.professionalIT.specification.ProfessionalSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service implementation for managing filters.
 * This class provides methods for retrieving professionals with filters.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-01
 */
@Service
@RequiredArgsConstructor
public class FilterServiceImpl implements FilterService {

    private final  ProfessionalRepository repository;
    private final ProfessionalProfileMapper mapper;

    /**
     * Retrieves a list of professionals with filters.
     * @param hardSkillIds The unique identifier of the hard skill.
     * @param softSkillIds The unique identifier of the soft skill.
     * @param workModeIds The unique identifier of the work mode.
     * @param hasAvailInmediate The availability of the professional.
     * @param hasAvailTravel The availability of the professional.
     * @param fieldIds The unique identifier of the field.
     * @param seniorities The seniority of the professional.
     * @param knowLanguageList The unique identifier of the language.
     * @param countryId The unique identifier of the country.
     * @param provinceId The unique identifier of the province.
     * @param localityId The unique identifier of the locality.
     * @return A list of ProfessionalProfile objects representing professionals.
     */
    public List<ProfessionalProfile> getProfessionalsWithFilters(

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
        List<ProfessionalEntity> filteredProfessionals = repository.findAll(specification);
        return filteredProfessionals.stream().map(mapper::toDto).toList();
    }
}
