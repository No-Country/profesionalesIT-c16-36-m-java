package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.CustomerDTO;
import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.entities.CustomerEntity;
import com.nocountry.professionalIT.entities.PersonEntity;
import com.nocountry.professionalIT.entities.UserEntity;
import com.nocountry.professionalIT.enums.Gender;
import com.nocountry.professionalIT.enums.Role;
import com.nocountry.professionalIT.repository.CustomerRepository;
import com.nocountry.professionalIT.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerEntity SaveCustomer(CustomerDTO customerDTO) {
        CustomerEntity customer = CustomerEntity.builder()
                .person(PersonEntity.builder()
                        .user(UserEntity.builder()
                                .email(customerDTO.getPerson().getUser().getEmail())
                                .role(Role.CLIENT)
                                .build())
                        .name(customerDTO.getPerson().getName())
                        .lastName(customerDTO.getPerson().getLastName())
                        .gender(Gender.valueOf(customerDTO.getPerson().getGender().name()))
                        .country(CountryEntity.builder()
                                .id(customerDTO.getPerson().getCountry().getId())
                                .build())
                        .build())
                .build();
        return customerRepository.save(customer);
    }
}
