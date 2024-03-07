package com.nocountry.professionalIT.specification;

import com.nocountry.professionalIT.entities.ProfessionalEntity;
import com.nocountry.professionalIT.enums.Seniority;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.stream.Collectors;

public class ProfessionalSpecification {
    public static Specification<ProfessionalEntity> buildDynamicFilters(
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

        return (root, query, criteriaBuilder) -> {
            Predicate dynamicPredicate = criteriaBuilder.conjunction();

            if (skillIds != null && !skillIds.isEmpty()) {
                dynamicPredicate = criteriaBuilder.and(dynamicPredicate, root.join("skillList").get("id").in(skillIds));
            }
            if (workModeIds != null && !workModeIds.isEmpty()) {
                dynamicPredicate = criteriaBuilder.or(
                        dynamicPredicate,
                        root.join("workModes").join("mode").get("id").in(workModeIds)
                );
            }
            if (hasAvailInmediate != null) {
                dynamicPredicate = criteriaBuilder.and(dynamicPredicate, criteriaBuilder.equal(root.get("availInmediate"), hasAvailInmediate));
            }
            if (hasAvailTravel != null) {
                dynamicPredicate = criteriaBuilder.and(dynamicPredicate, criteriaBuilder.equal(root.get("availTravel"), hasAvailTravel));
            }
            if (fieldIds != null) {
                dynamicPredicate = criteriaBuilder.or(dynamicPredicate, root.join("fieldId").get("id").in(fieldIds));
            }
            if (seniorities != null && !seniorities.isEmpty()) {
                dynamicPredicate = criteriaBuilder.or(
                        dynamicPredicate,
                        root.get("seniority").in(seniorities.stream().map(Seniority::valueOf).toList())
                );
            }
            if (knowLanguageList != null && !knowLanguageList.isEmpty()) {
                dynamicPredicate = criteriaBuilder.and(
                        dynamicPredicate,
                        root.join("knowLanguage").join("language").get("id").in(knowLanguageList)
                );
            }
            if (countryId != null) {
                dynamicPredicate = criteriaBuilder.and(
                        dynamicPredicate,
                        root.join("person").join("country").get("id").in(countryId)
                );
            }
            if (provinceId != null) {
                dynamicPredicate = criteriaBuilder.and(
                        dynamicPredicate,
                        root.join("person").join("province").get("id").in(provinceId)
                );
            }
            if (localityId != null) {
                dynamicPredicate = criteriaBuilder.and(
                        dynamicPredicate,
                        root.join("person").join("province").join("locality").get("id").in(provinceId)
                );
            }

            return dynamicPredicate;
        };
    }

}