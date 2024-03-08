package com.nocountry.professionalIT.controller;

import com.nocountry.professionalIT.dto.RecruiterDTO;
import com.nocountry.professionalIT.entities.RecruiterEntity;
import com.nocountry.professionalIT.service.RecruiterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("recruiter")
public class RecruiterController {

    private final RecruiterService recruiterService;

    @PostMapping("/save")
    public ResponseEntity<RecruiterEntity> saveRecruiter(@RequestBody @Validated RecruiterDTO recruiterDTO){
        return ResponseEntity.ok().body(recruiterService.saveNewRecruiter(recruiterDTO.getPerson(),recruiterDTO.getUser()));
    }

    @GetMapping()
    public ResponseEntity<List<RecruiterEntity>> findAll(){
        return ResponseEntity.ok().body(recruiterService.findAll());
    }
}
