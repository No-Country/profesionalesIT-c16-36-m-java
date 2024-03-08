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

import com.nocountry.professionalIT.dto.ModeDto;
import com.nocountry.professionalIT.service.impl.ModeServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("mode")
@RequiredArgsConstructor
public class ModeController {

	private final ModeServiceImpl modeService;
    

    @PostMapping("/add")
    public void create(@RequestBody ModeDto m) {
    	modeService.save(m);
    }

    @PutMapping("/edit") //?
    public void edit(@PathVariable Integer id, @RequestBody ModeDto m) {
    	modeService.update(id,m);
    }

    @GetMapping("/get-all")
    public List<ModeDto> getAll() {
        return modeService.modeList();
    }

    @GetMapping("/get/{id}")
    public Optional<ModeDto> get(@PathVariable Integer id) {
        return modeService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
    	modeService.deleteById(id);
    }
    
}
