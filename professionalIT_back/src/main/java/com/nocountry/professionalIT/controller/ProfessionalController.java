package com.nocountry.professionalIT.controller;

import com.nocountry.professionalIT.dto.ProfessionalEntityDto;
import com.nocountry.professionalIT.dto.SaveProfessional;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import com.nocountry.professionalIT.service.ProfessionalService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/professional")
public class ProfessionalController {

    private final ProfessionalService professionalService;

    @PostMapping("/save")
    public ResponseEntity<ProfessionalEntity> saveProfessional(@RequestBody @Validated SaveProfessional professionalDTO){
        return ResponseEntity.ok().body(professionalService.saveNewProfessional(professionalDTO.getPerson(),professionalDTO.getUser()));
    }

    @GetMapping()
    public ResponseEntity<Page<ProfessionalEntity>> findAll(@RequestParam(value = "page",defaultValue = "0") int page,
                                                            @RequestParam(value = "size",defaultValue = "10") int size){
        return ResponseEntity.ok().body(professionalService.findAll(page, size));
    }
}
