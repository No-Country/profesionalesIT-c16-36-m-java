package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.PersonDTO;
import com.nocountry.professionalIT.dto.UserDTO;
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
    public CustomerEntity saveNewCustomer(PersonDTO personDTO, UserDTO userDTO) {

        UserEntity user = UserEntity.builder()
                .email(userDTO.getEmail())
                .role(Role.CUSTOMER)
                .build();

        PersonEntity person = PersonEntity.builder()
                .user(user)
                .name(personDTO.getName())
                .lastName(personDTO.getLastName())
                .gender(Gender.valueOf(personDTO.getGender().name()))
                .country(CountryEntity.builder()
                        .id(personDTO.getCountry().getId())
                        .build())
                .build();

        CustomerEntity customer = CustomerEntity.builder()
                .person(person)
                .build();
        return customerRepository.save(customer);
    }
}
