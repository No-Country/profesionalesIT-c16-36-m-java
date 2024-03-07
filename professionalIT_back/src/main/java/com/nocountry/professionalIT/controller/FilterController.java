package com.nocountry.professionalIT.controller;

import com.nocountry.professionalIT.entities.*;
import com.nocountry.professionalIT.service.impl.FilterServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("professionals")
public class FilterController {

        private final FilterServiceImpl filterService;

        @GetMapping("/filter")
        public ResponseEntity<List<ProfessionalEntity>> getFilteredProfessionals(
                @RequestParam(required = false) List<Integer> skillIds,
                @RequestParam(required = false) List<Integer> workModeIds,
                @RequestParam(required = false) Boolean hasAvailInmediate,
                @RequestParam(required = false) Boolean hasAvailTravel,
                @RequestParam(required = false) List<Integer> fieldIds,
                @RequestParam(required = false) List<String> seniorities,
                @RequestParam(required = false) List<Integer> knowLanguageList,
                @RequestParam(required = false) Integer countryId,
                @RequestParam(required = false) Integer provinceId,
                @RequestParam(required = false) Integer localityId) {

            List<ProfessionalEntity> filteredProfessionals = filterService.getProfessionalsWithFilters(
                    skillIds, workModeIds, hasAvailInmediate, hasAvailTravel, fieldIds, seniorities, knowLanguageList, countryId, provinceId, localityId);
            if(filteredProfessionals != null && !filteredProfessionals.isEmpty()) {
                return ResponseEntity.ok(filteredProfessionals);
            }
                return ResponseEntity.notFound().build();

        }

    }
