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

import com.nocountry.professionalIT.dto.HardSkillDto;
import com.nocountry.professionalIT.service.impl.HardSkillServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("hardskill")
@RequiredArgsConstructor
public class HardSkillController {
	
	private final HardSkillServiceImpl hardSkillService;
    

    @PostMapping("/add")
    public void create(@RequestBody HardSkillDto hs) {
        hardSkillService.save(hs);
    }

    @PutMapping("/edit") //?
    public void edit(@PathVariable Integer id, @RequestBody HardSkillDto hs) {
        hardSkillService.update(id,hs);
    }

    @GetMapping("/get-all")
    public List<HardSkillDto> getAll() {
        return hardSkillService.hardSkillList();
    }

    @GetMapping("/get/{id}")
    public Optional<HardSkillDto> get(@PathVariable Integer id) {
        return hardSkillService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        hardSkillService.deleteById(id);
    }
}
