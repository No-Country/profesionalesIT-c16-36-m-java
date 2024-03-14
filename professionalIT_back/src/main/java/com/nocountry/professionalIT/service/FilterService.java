package com.nocountry.professionalIT.service;


import com.nocountry.professionalIT.dto.ProfessionalProfile;
import java.util.List;

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
