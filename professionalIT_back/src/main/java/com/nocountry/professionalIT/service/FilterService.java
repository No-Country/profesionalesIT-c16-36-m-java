package com.nocountry.professionalIT.service;


import com.nocountry.professionalIT.dto.ProfessionalProfile;
import java.util.List;

/**
 * Service interface for managing filters.
 * This interface defines methods for retrieving professionals with filters.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-05
 */
public interface FilterService {
    List<ProfessionalProfile> getProfessionalsWithFilters(
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
            Integer localityId);

}
