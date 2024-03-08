package com.nocountry.professionalIT.controller;

import java.util.List;
import java.util.Optional;

import com.nocountry.professionalIT.dto.SSDto;
import com.nocountry.professionalIT.dto.SoftSkillsDto;
import com.nocountry.professionalIT.service.impl.SsServiceImpl;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nocountry.professionalIT.service.impl.SoftSkillsServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("softskill")
@RequiredArgsConstructor
public class SoftSkillController {

	private final SoftSkillsServiceImpl softSkillService;
    private final SsServiceImpl SsServiceImpl;
    

    @PostMapping("/add")
    public void create(@RequestBody SoftSkillsDto m) {
    	softSkillService.save(m);
    }

    @PutMapping("/edit") //?
    public void edit(@PathVariable Integer id, @RequestBody SoftSkillsDto m) {
    	softSkillService.update(id,m);
    }

    @GetMapping("/get-all")
    public List<SSDto> getAll() {
        return SsServiceImpl.skillList();
    }

    @GetMapping("/get/{id}")
    public Optional<SoftSkillsDto> get(@PathVariable Integer id) {
        return softSkillService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
    	softSkillService.deleteById(id);
    }
}
