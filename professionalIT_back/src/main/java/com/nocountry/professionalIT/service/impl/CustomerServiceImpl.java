package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.PersonDTO;
import com.nocountry.professionalIT.dto.UserDTO;
import com.nocountry.professionalIT.entities.*;
import com.nocountry.professionalIT.enums.Gender;
import com.nocountry.professionalIT.enums.Role;
import com.nocountry.professionalIT.exception.ObjectNotFoundException;
import com.nocountry.professionalIT.repository.CustomerRepository;
import com.nocountry.professionalIT.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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
                .province(ProvinceEntity.builder()
                        .id(personDTO.getProvince().getId())
                        .build())
                .locality(LocalityEntity.builder()
                        .id(personDTO.getLocality().getId())
                        .build())
                .build();

        CustomerEntity customer = CustomerEntity.builder()
                .person(person)
                .build();
        return customerRepository.save(customer);
    }

    @Override
    public CustomerEntity findById(UUID id) {
        return customerRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Cliente no encontrado"));
    }

    @Override
    public List<CustomerEntity> findAll() {
        return customerRepository.findAll();
    }
}
