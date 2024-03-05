package com.nocountry.professionalIT.controller;

import com.nocountry.professionalIT.dto.CountryDTO;
import com.nocountry.professionalIT.dto.LocalityDTO;
import com.nocountry.professionalIT.dto.ProvinceDTO;
import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.entities.LocalityEntity;
import com.nocountry.professionalIT.entities.ProvinceEntity;
import com.nocountry.professionalIT.mapper.CountryMapper;
import com.nocountry.professionalIT.mapper.LocalityMapper;
import com.nocountry.professionalIT.mapper.ProvinceMapper;
import com.nocountry.professionalIT.service.CountryService;
import com.nocountry.professionalIT.service.LocalityService;
import com.nocountry.professionalIT.service.ProvinceService;
import jakarta.persistence.EntityNotFoundException;
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

    private final CountryMapper countryMapper;

    private final ProvinceMapper provinceMapper;

    private final LocalityMapper localityMapper;

    @GetMapping("/{id}")
    public ResponseEntity<CountryDTO> findCountryById (@PathVariable Integer id){

        CountryEntity countryOptional = countryService.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Pais no encontrado"));
        return ResponseEntity.ok().body(countryMapper.toDto(countryOptional));
    }

    @GetMapping()
    public ResponseEntity<List<CountryDTO>> findAllCountries (){
        List<CountryEntity> contryList = countryService.findAll();
        contryList.forEach(country -> country.setProvinces(null));
        return ResponseEntity.ok().body(countryMapper.toDtoList(contryList));
    }

    @GetMapping("{id}/provinces")
    public ResponseEntity<List<ProvinceDTO>> searchProvinces (@RequestParam(required = false) String search,
                                              @PathVariable Integer id){

        List<ProvinceEntity> provinceEntityList;
        if (search == null || search.isEmpty()){
            provinceEntityList = provinceService.findProvincesByCountryId(id);
        }else {
            provinceEntityList = provinceService.searchProvinces(search, id);
        }

        return ResponseEntity.ok().body(provinceMapper.toDtoList(provinceEntityList));
    }

    @GetMapping("/province/{id}/localities")
    public ResponseEntity<List<LocalityDTO>> searchLocalities (@PathVariable Integer id,
                                               @RequestParam(required = false) String search){

        List<LocalityEntity> localityEntityList;
        if (search == null || search.isEmpty()){
            localityEntityList = localityService.findLocalitiesByProvinceId(id);
        }else{
            localityEntityList = localityService.searchLocalities(search,id);
        }

        return ResponseEntity.ok().body(localityMapper.toDtoList(localityEntityList));
    }
}
