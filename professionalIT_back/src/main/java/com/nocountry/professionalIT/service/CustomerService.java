package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.CustomerDTO;
import com.nocountry.professionalIT.entities.CustomerEntity;

public interface CustomerService {

    CustomerEntity SaveCustomer(CustomerDTO customerDTO);
}
