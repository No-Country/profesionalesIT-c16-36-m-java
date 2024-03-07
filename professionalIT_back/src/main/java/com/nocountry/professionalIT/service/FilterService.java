package com.nocountry.professionalIT.service;


import com.nocountry.professionalIT.entities.*;
import java.util.List;

public interface FilterService {
    List<ProfessionalEntity> getProfessionalsWithFilters(
            List<Integer> skillIds,
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
