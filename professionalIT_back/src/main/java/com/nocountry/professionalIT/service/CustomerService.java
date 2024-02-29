package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.PersonDTO;
import com.nocountry.professionalIT.dto.UserDTO;
import com.nocountry.professionalIT.entities.CustomerEntity;

public interface CustomerService {

    CustomerEntity saveNewCustomer(PersonDTO personDTO, UserDTO userDTO);
}
