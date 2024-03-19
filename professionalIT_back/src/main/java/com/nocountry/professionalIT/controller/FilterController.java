package com.nocountry.professionalIT.controller;

import com.nocountry.professionalIT.dto.ProfessionalProfile;
import com.nocountry.professionalIT.service.impl.FilterServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * Controller for the filter of professionals.
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("professionals")
public class FilterController {

        private final FilterServiceImpl filterService;

        @GetMapping("/filter")
        public ResponseEntity<List<ProfessionalProfile>> getFilteredProfessionals(
                @RequestParam(required = false) List<Integer> hardSkills,
                @RequestParam(required = false) List<Integer> softSkills,
                @RequestParam(required = false) List<Integer> modality,
                @RequestParam(required = false) Boolean hasAvailInmediate,
                @RequestParam(required = false) Boolean hasAvailTravel,
                @RequestParam(required = false) List<Integer> field,
                @RequestParam(required = false) List<String> seniority,
                @RequestParam(required = false) List<Integer> knowLanguage,
                @RequestParam(required = false) Integer country,
                @RequestParam(required = false) Integer province,
                @RequestParam(required = false) Integer locality) {

            List<ProfessionalProfile> filteredProfessionals = filterService.getProfessionalsWithFilters(
                    hardSkills, softSkills, modality, hasAvailInmediate, hasAvailTravel, field, seniority, knowLanguage, country, province, locality);
            if(filteredProfessionals != null && !filteredProfessionals.isEmpty()) {
                return ResponseEntity.ok(filteredProfessionals);
            }

            return ResponseEntity.notFound().build();

        }

    }
