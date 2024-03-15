package com.nocountry.professionalIT.controller;

import com.nocountry.professionalIT.dto.CompanyDto;
import com.nocountry.professionalIT.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller for Company.
 * @version 1.0
 * @since 2024-02-16
 */
@RestController
@RequestMapping("company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService service;

    /**
     * Method to get all companies.
     * @return ResponseEntity<List<CompanyDto>>
     */
    @GetMapping
    public ResponseEntity<List<CompanyDto>> findAllCompanies (){
        return ResponseEntity.ok().body(service.companyList());
    }
}
