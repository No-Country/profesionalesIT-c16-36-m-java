package com.nocountry.professionalIT.controller;

import com.nocountry.professionalIT.dto.EnterpriseDTO;
import com.nocountry.professionalIT.entities.EnterpriseEntity;
import com.nocountry.professionalIT.service.EnterpriseService;
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
    public ResponseEntity<?> searchEnterprises(@RequestParam String search){

            List<EnterpriseDTO> enterpriseDTOList = enterpriseService.findByNameContainingIgnoreCase(search)
                    .stream()
                    .map(enterprise -> EnterpriseDTO.builder()
                            .id(enterprise.getId())
                            .name(enterprise.getName())
                            .description(enterprise.getDescription())
                            .logo(enterprise.getLogo())
                            .build())
                    .toList();
            return ResponseEntity.ok(enterpriseDTOList);

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findEnterprise (@PathVariable Integer id){

        EnterpriseEntity enterprise = enterpriseService.findById(id);

        EnterpriseDTO enterpriseDTO = EnterpriseDTO.builder()
                .name(enterprise.getName())
                .description(enterprise.getDescription())
                .logo(enterprise.getLogo())
                .build();
        return ResponseEntity.ok().body(enterpriseDTO);
    }

    @PostMapping("/save")
    public ResponseEntity<EnterpriseEntity> saveEnterprise(@RequestBody EnterpriseDTO enterpriseDTO){
        return ResponseEntity.ok().body(enterpriseService.saveEnterprise(enterpriseDTO));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EnterpriseEntity> updateEnterprise(@PathVariable Integer id,
                                                             @RequestBody EnterpriseDTO enterpriseDTO){
        return ResponseEntity.ok().body(enterpriseService.updateEnterprise(id, enterpriseDTO));
    }
}

