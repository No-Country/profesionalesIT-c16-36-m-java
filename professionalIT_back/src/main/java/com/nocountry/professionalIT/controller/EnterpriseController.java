package com.nocountry.professionalIT.controller;

import com.nocountry.professionalIT.dto.EnterpriseDTO;
import com.nocountry.professionalIT.service.EnterpriseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("enterprise")
public class EnterpriseController {

    private final EnterpriseService enterpriseService;

    @GetMapping()
    public ResponseEntity<List<EnterpriseDTO>> searchEnterprises(@RequestParam String search){
            return ResponseEntity.ok().body(enterpriseService.findByNameContainingIgnoreCase(search));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnterpriseDTO> findEnterprise (@PathVariable Integer id){
        return ResponseEntity.ok().body(enterpriseService.findById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<EnterpriseDTO> saveEnterprise(@RequestBody @Valid EnterpriseDTO enterpriseDTO){
        return ResponseEntity.ok().body(enterpriseService.saveEnterprise(enterpriseDTO));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EnterpriseDTO> updateEnterprise(@PathVariable Integer id,
                                                             @RequestBody @Valid EnterpriseDTO enterpriseDTO){
        return ResponseEntity.ok().body(enterpriseService.updateEnterprise(id, enterpriseDTO));
    }
}

