package com.nocountry.professionalIT.specification;

import com.nocountry.professionalIT.entities.KnowLanguageEntity;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import com.nocountry.professionalIT.enums.Seniority;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to build dynamic filters for the professionals.
 * It uses the Specification interface from Spring Data JPA to build the filters.
 * The filters are built using the criteriaBuilder and the root of the entity.
 * @author: Claudia Ortiz
 * @version: 1.0
 * @since: 2024-03-01
 */
public class ProfessionalSpecification {

    /**
     * This method is used to build the dynamic filters for the professionals.
     * @param hardSkillIds the unique identifier of the hard skill.
     * @param softSkillIds the unique identifier of the soft skill.
     * @param workModeIds the unique identifier of the work mode.
     * @param hasAvailInmediate the availability of the professional.
     * @param hasAvailTravel the availability of the professional.
     * @param fieldIds the unique identifier of the field.
     * @param seniorities the seniority of the professional.
     * @param knowLanguageList the unique identifier of the language.
     * @param countryId the unique identifier of the country.
     * @param provinceId the unique identifier of the province.
     * @param localityId the unique identifier of the locality.
     * @return Specification<ProfessionalEntity>
     */
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

                List<Predicate> hardSkillPredicates = new ArrayList<>();

                for (Integer hardSkillId : hardSkillIds) {
                    Predicate hardSkillPredicate = criteriaBuilder.equal(hardSkillsJoin.get("hs").get("id"), hardSkillId);

                    hardSkillPredicates.add(hardSkillPredicate);
                }

                Predicate hardSkillsPredicate = criteriaBuilder.and(hardSkillPredicates.toArray(new Predicate[0]));
                predicates.add(hardSkillsPredicate);
            }

            if (softSkillIds != null && !softSkillIds.isEmpty()) {
                Join<ProfessionalEntity, ?> softSkillsJoin = root.join("softSkills");

                List<Predicate> softSkillPredicates = new ArrayList<>();

                for (Integer softSkillId : softSkillIds) {
                    Predicate softSkillPredicate = criteriaBuilder.equal(softSkillsJoin.get("ss").get("id"), softSkillId);

                    softSkillPredicates.add(softSkillPredicate);
                }

                Predicate softSkillsPredicate = criteriaBuilder.and(softSkillPredicates.toArray(new Predicate[0]));
                predicates.add(softSkillsPredicate);
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
                Join<KnowLanguageEntity, ?> knowLanguageJoin = root.join("knowLanguage");
                List<Predicate> knowLanguagePredicates = new ArrayList<>();
                for (Integer knowLanguageId : knowLanguageList) {
                    Predicate knowLanguagePredicate = criteriaBuilder.equal(knowLanguageJoin.get("language").get("id"), knowLanguageId);
                    knowLanguagePredicates.add(knowLanguagePredicate);
                }
                Predicate knowLanguagePredicate = criteriaBuilder.or(knowLanguagePredicates.toArray(new Predicate[0]));
                predicates.add(knowLanguagePredicate);
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
