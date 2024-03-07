package com.nocountry.professionalIT.controller;
import org.springframework.web.bind.annotation.RestController;

import com.nocountry.professionalIT.dto.WorkExperienceDto;
import com.nocountry.professionalIT.service.impl.WorkExpServiceImpl;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experience")
@RequiredArgsConstructor
public class WorkExperienceController {

	private final WorkExpServiceImpl workExperienceService;
    

    @PostMapping("/add")
    public void create(@RequestBody WorkExperienceDto m) {
    	workExperienceService.save(m);
    }

    @PutMapping("/edit") //?
    public void edit(@PathVariable Integer id, @RequestBody WorkExperienceDto m) {
    	workExperienceService.update(id,m);
    }

    @GetMapping("/get-all")
    public List<WorkExperienceDto> getAll() {
        return workExperienceService.workExperienceList();
    }

    @GetMapping("/get/{id}")
    public Optional<WorkExperienceDto> get(@PathVariable Integer id) {
        return workExperienceService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
    	workExperienceService.deleteById(id);
    }
}
