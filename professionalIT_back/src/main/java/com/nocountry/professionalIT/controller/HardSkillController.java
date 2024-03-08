package com.nocountry.professionalIT.controller;

import java.util.List;
import java.util.Optional;

import com.nocountry.professionalIT.dto.HSDto;
import com.nocountry.professionalIT.dto.HardSkillsDto;
import com.nocountry.professionalIT.service.HSService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nocountry.professionalIT.service.impl.HardSkillServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("hardskill")
@RequiredArgsConstructor
public class HardSkillController {

	private final HardSkillServiceImpl hardSkillService;
    private final HSService HSService;

    

    @PostMapping("/add")
    public void create(@RequestBody HardSkillsDto hs) {
        hardSkillService.save(hs);
    }

    @PutMapping("/edit") //?
    public void edit(@PathVariable Integer id, @RequestBody HardSkillsDto hs) {
        hardSkillService.update(id,hs);
    }

    @GetMapping("/get-all")
    public List<HSDto> getAll() {
        return HSService.skillList();
    }

    @GetMapping("/get/{id}")
    public Optional<HardSkillsDto> get(@PathVariable Integer id) {
        return hardSkillService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        hardSkillService.deleteById(id);
    }
}
