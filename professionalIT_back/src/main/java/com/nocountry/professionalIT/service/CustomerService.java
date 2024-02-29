package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.PersonDTO;
import com.nocountry.professionalIT.dto.UserDTO;
import com.nocountry.professionalIT.entities.CustomerEntity;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    CustomerEntity saveNewCustomer(PersonDTO personDTO, UserDTO userDTO);

    CustomerEntity findById (UUID id);

    List<CustomerEntity> findAll();
}
