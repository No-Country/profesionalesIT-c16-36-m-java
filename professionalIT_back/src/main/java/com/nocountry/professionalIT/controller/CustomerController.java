package com.nocountry.professionalIT.controller;

import com.nocountry.professionalIT.dto.CustomerDTO;
import com.nocountry.professionalIT.entities.CustomerEntity;
import com.nocountry.professionalIT.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;


    @PostMapping("/save")
    public ResponseEntity<CustomerEntity> saveCustomer (@RequestBody @Validated CustomerDTO customerDTO){

        CustomerEntity customer = customerService.saveNewCustomer(customerDTO.getPerson(),customerDTO.getUser());

        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }

    @GetMapping()
    public ResponseEntity<?> findAll (){
        List<CustomerEntity> customer = customerService.findAll();
        return ResponseEntity.ok(customer);
    }
}
