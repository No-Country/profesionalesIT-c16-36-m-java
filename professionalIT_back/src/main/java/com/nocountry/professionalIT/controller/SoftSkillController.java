package com.nocountry.professionalIT.controller;

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

import com.nocountry.professionalIT.dto.SoftSkillDto;
import com.nocountry.professionalIT.service.impl.SoftSkillServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("softskill")
@RequiredArgsConstructor
public class SoftSkillController {

	private final SoftSkillServiceImpl softSkillService;
    

    @PostMapping("/add")
    public void create(@RequestBody SoftSkillDto m) {
    	softSkillService.save(m);
    }

    @PutMapping("/edit") //?
    public void edit(@PathVariable Integer id, @RequestBody SoftSkillDto m) {
    	softSkillService.update(id,m);
    }

    @GetMapping("/get-all")
    public List<SoftSkillDto> getAll() {
        return softSkillService.softSkillList();
    }

    @GetMapping("/get/{id}")
    public Optional<SoftSkillDto> get(@PathVariable Integer id) {
        return softSkillService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
    	softSkillService.deleteById(id);
    }
}
