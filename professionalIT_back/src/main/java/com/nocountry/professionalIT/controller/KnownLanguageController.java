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

import com.nocountry.professionalIT.dto.KnownLanguageDto;
import com.nocountry.professionalIT.service.impl.KnownLanguageServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("knownlanguage")
@RequiredArgsConstructor
public class KnownLanguageController {
		
		private final KnownLanguageServiceImpl knownLanguageService;
	    

	    @PostMapping("/add")
	    public void create(@RequestBody KnownLanguageDto kl) {
	    	knownLanguageService.save(kl);
	    }

	    @PutMapping("/edit") //?
	    public void edit(@PathVariable Integer id, @RequestBody KnownLanguageDto kl) {
	    	knownLanguageService.update(id,kl);
	    }

	    @GetMapping("/get-all")
	    public List<KnownLanguageDto> getAll() {
	        return knownLanguageService.knownLanguageList();
	    }

	    @GetMapping("/get/{id}")
	    public Optional<KnownLanguageDto> get(@PathVariable Integer id) {
	        return knownLanguageService.findById(id);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void delete(@PathVariable Integer id) {
	    	knownLanguageService.deleteById(id);
	    }

}
