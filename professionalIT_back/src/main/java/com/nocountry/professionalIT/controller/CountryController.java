package com.nocountry.professionalIT.controller;

import com.nocountry.professionalIT.dto.CountryDTO;
import com.nocountry.professionalIT.dto.LocalityDTO;
import com.nocountry.professionalIT.dto.ProvinceDTO;
import com.nocountry.professionalIT.service.CountryService;
import com.nocountry.professionalIT.service.LocalityService;
import com.nocountry.professionalIT.service.ProvinceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/country")
public class CountryController {

    private final CountryService countryService;

    private final ProvinceService provinceService;

    private final LocalityService localityService;

    @GetMapping("/{id}")
    public ResponseEntity<CountryDTO> findCountryById (@PathVariable Integer id){
        return ResponseEntity.ok().body(countryService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<CountryDTO>> findAllCountries (){
        return ResponseEntity.ok().body(countryService.findAll());
    }

    @GetMapping("{id}/provinces")
    public ResponseEntity<List<ProvinceDTO>> searchProvinces (@RequestParam(required = false) String search,
                                              @PathVariable Integer id){
        return ResponseEntity.ok().body(provinceService.searchProvinces(search, id));
    }

    @GetMapping("/province/{id}/localities")
    public ResponseEntity<List<LocalityDTO>> searchLocalities (@PathVariable Integer id,
                                               @RequestParam(required = false) String search){
        return ResponseEntity.ok().body(localityService.searchLocalities(search,id));
    }
}