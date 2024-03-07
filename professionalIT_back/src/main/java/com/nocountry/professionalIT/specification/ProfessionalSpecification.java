package com.nocountry.professionalIT.specification;

import com.nocountry.professionalIT.entities.ProfessionalEntity;
import com.nocountry.professionalIT.enums.Seniority;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProfessionalSpecification {
    public static Specification<ProfessionalEntity> buildDynamicFilters(
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

        return (root, query, criteriaBuilder) -> {

            List<Predicate> predicates = new ArrayList<>();
            if (hardSkillIds != null && !hardSkillIds.isEmpty()) {
                Join<ProfessionalEntity, ?> hardSkillsJoin = root.join("hardSkills");
                Path<?> hardSkillsPath = hardSkillsJoin.get("hs").get("id");
                predicates.add(hardSkillsPath.in(hardSkillIds));
            }
            if (softSkillIds != null && !softSkillIds.isEmpty()) {
                Join<ProfessionalEntity, ?> softSkillsJoin = root.join("softSkills");
                Path<?> softSkillsPath = softSkillsJoin.get("ss").get("id");
                predicates.add(softSkillsPath.in(softSkillIds));
            }
            if (workModeIds != null && !workModeIds.isEmpty()) {
                Join<ProfessionalEntity, ?> workModeJoin = root.join("workMode");
                Path<?> workModePath = workModeJoin.get("id");
                predicates.add(workModePath.in(workModeIds));
            }
            if (hasAvailInmediate != null) {
                predicates.add(criteriaBuilder.equal(root.get("availInmediate"), hasAvailInmediate));
            }
            if (hasAvailTravel != null) {
                predicates.add(criteriaBuilder.equal(root.get("availTravel"), hasAvailTravel));
            }
            if (fieldIds != null) {
                Join<ProfessionalEntity, ?> fieldJoin = root.join("field");
                predicates.add(fieldJoin.get("id").in(fieldIds));
            }

            if (seniorities != null && !seniorities.isEmpty()) {
                List<Seniority> seniorityEnumList = seniorities.stream()
                        .map(Seniority::valueOf)
                                .toList();
                predicates.add(root.get("seniority").in(seniorityEnumList));
            }
            if (knowLanguageList != null && !knowLanguageList.isEmpty()) {
                Join<ProfessionalEntity, ?> knowLanguageJoin = root.join("knowLanguage");
                predicates.add(knowLanguageJoin.get("language").get("id").in(knowLanguageList));
            }

            if (countryId != null) {
                Join<ProfessionalEntity, ?> countryJoin = root.join("person").join("country");
                predicates.add(countryJoin.get("id").in(countryId));
            }

            if (provinceId != null) {
                Join<ProfessionalEntity, ?> provinceJoin = root.join("person").join("province");
                Path<?> provincePath = provinceJoin.get("id");
                predicates.add(provincePath.in(provinceId));
            }

            if (localityId != null) {
                Join<ProfessionalEntity, ?> localityJoin = root.join("person").join("province").join("localities");
                Path<?> localityPath = localityJoin.get("id");
                predicates.add(localityPath.in(localityId));
            }

            Predicate dynamicPredicate = criteriaBuilder.and(predicates.toArray(new Predicate[0]));
            query.where(dynamicPredicate);
            return dynamicPredicate;

        };
    }
}
