package com.nocountry.professionalIT.controller;


import com.nocountry.professionalIT.dto.AvailabilityDto;
import com.nocountry.professionalIT.service.AvailabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("availability")
public class AvailabilityController {

    private final AvailabilityService service;
    @GetMapping
    public ResponseEntity<List<AvailabilityDto>> findAllAvailabilities (){
        return ResponseEntity.ok().body(service.availabilityList());
    }

}
