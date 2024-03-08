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

import com.nocountry.professionalIT.dto.WorkModeDto;
import com.nocountry.professionalIT.service.impl.WorkModeServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("workmode")
@RequiredArgsConstructor
public class WorkModeController {
	
	private final WorkModeServiceImpl workModeService;
    

    @PostMapping("/add")
    public void create(@RequestBody WorkModeDto m) {
    	workModeService.save(m);
    }

    @PutMapping("/edit") //?
    public void edit(@PathVariable Integer id, @RequestBody WorkModeDto m) {
    	workModeService.update(id,m);
    }

    @GetMapping("/get-all")
    public List<WorkModeDto> getAll() {
        return workModeService.workModeList();
    }

    @GetMapping("/get/{id}")
    public Optional<WorkModeDto> get(@PathVariable Integer id) {
        return workModeService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
    	workModeService.deleteById(id);
    }
}
