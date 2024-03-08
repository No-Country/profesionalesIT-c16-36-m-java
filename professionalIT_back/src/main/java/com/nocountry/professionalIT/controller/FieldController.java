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

import com.nocountry.professionalIT.dto.FieldDto;
import com.nocountry.professionalIT.service.FieldService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("field")
@RequiredArgsConstructor
public class FieldController {
    
	private final FieldService fieldService;
    

    @PostMapping("/add")
    public void create(@RequestBody FieldDto f) {
        fieldService.save(f);
    }

    @PutMapping("/edit/{id}") //?
    public void edit(@PathVariable Integer id, @RequestBody FieldDto f) {
        fieldService.update(id,f);
    }

    @GetMapping("/get-all")
    public List<FieldDto> getAll() {
        return fieldService.fieldList();
    }

    @GetMapping("/get/{id}")
    public Optional<FieldDto> get(@PathVariable Integer id) {
        return fieldService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        fieldService.deleteById(id);
    }
}
