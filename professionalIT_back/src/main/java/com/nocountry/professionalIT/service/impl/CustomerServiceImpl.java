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

/**
 * Implementation of the CustomerService interface that provides
 * methods to access customer information.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-28
 * */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    /**
     * Saves a new customer based on the provided person and user data.
     *
     * @param personDTO The DTO containing the person data for the new customer.
     * @param userDTO The DTO containing the user data for the new customer.
     * @return The newly created customer entity.
     */
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

    /**
     * Finds a customer by its ID.
     *
     * @param id The ID of the customer to find.
     * @return The customer entity with the specified ID.
     * @throws ObjectNotFoundException If no customer is found with the given ID.
     */
    @Override
    public CustomerEntity findById(UUID id) {
        return customerRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Cliente no encontrado"));
    }

    /**
     * Retrieves all customers.
     *
     * @return A list of all customers.
     */
    @Override
    public List<CustomerEntity> findAll() {
        return customerRepository.findAll();
    }
}
