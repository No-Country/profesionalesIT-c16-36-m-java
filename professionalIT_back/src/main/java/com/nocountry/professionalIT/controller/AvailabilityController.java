package com.nocountry.professionalIT.controller;


import com.nocountry.professionalIT.dto.AvailabilityDto;
import com.nocountry.professionalIT.service.AvailabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * Controller for Availability.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-02-16
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("availability")
public class AvailabilityController {

    private final AvailabilityService service;

    /**
     * Method to get all availabilities.
     * @return ResponseEntity<List<AvailabilityDto>>
     */
    @GetMapping
    public ResponseEntity<List<AvailabilityDto>> findAllAvailabilities (){
        return ResponseEntity.ok().body(service.availabilityList());
    }


}
