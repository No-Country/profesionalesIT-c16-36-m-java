package com.nocountry.professionalIT.controller;

import com.nocountry.professionalIT.dto.CountryDTO;
import com.nocountry.professionalIT.dto.LocalityDTO;
import com.nocountry.professionalIT.dto.ProvinceDTO;
import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.entities.LocalityEntity;
import com.nocountry.professionalIT.entities.ProvinceEntity;
import com.nocountry.professionalIT.service.CountryService;
import com.nocountry.professionalIT.service.LocalityService;
import com.nocountry.professionalIT.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private LocalityService localityService;

    @GetMapping("/{id}")
    public ResponseEntity<?> findCountryById (@PathVariable Integer id){

        Optional<CountryEntity> countryOptional = countryService.findById(id);

        if (countryOptional.isPresent()){
            CountryEntity country = countryOptional.get();

            CountryDTO countryDTO = CountryDTO.builder()
                    .id(country.getId())
                    .name(country.getName())
                    .provinceList(country.getProvinces())
                    .build();
            return ResponseEntity.ok(countryDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping()
    public ResponseEntity<?> findAllCountries (){

        List<CountryDTO> countryDTOList = countryService.findAll()
                .stream()
                .map(countryEntity -> CountryDTO.builder()
                        .id(countryEntity.getId())
                        .name(countryEntity.getName())
                        .build())
                .toList();
        return ResponseEntity.ok(countryDTOList);
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

        List<ProvinceDTO> provinceDTOList = provinceEntityList
                .stream()
                .map(provinceEntity -> ProvinceDTO.builder()
                        .id(provinceEntity.getId())
                        .name(provinceEntity.getName())
                        .build())
                .toList();
        return ResponseEntity.ok(provinceDTOList);
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

        List<LocalityDTO> localityDTOList = localityEntityList.stream()
                .map(localityEntity -> LocalityDTO.builder()
                        .id(localityEntity.getId())
                        .name(localityEntity.getName())
                        .build())
                .toList();
        return ResponseEntity.ok(localityDTOList);
    }
}
