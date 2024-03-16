package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.users.NewPerson;
import com.nocountry.professionalIT.dto.users.NewUser;
import com.nocountry.professionalIT.entities.CustomerEntity;

import java.util.List;
import java.util.UUID;

/**
 * Service interface for managing CustomerEntity
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-28
 * */
public interface CustomerService {

    /**
     * Saves a new customer based on the provided person and user data.
     *
     * @param newPerson The DTO containing the person data for the new customer.
     * @param newUser The DTO containing the user data for the new customer.
     * @return The newly created customer entity.
     */
    CustomerEntity saveNewCustomer(NewPerson newPerson, NewUser newUser);

    /**
     * Finds a customer by its ID.
     *
     * @param id The ID of the customer to find.
     * @return The customer entity with the specified ID.
     */
    CustomerEntity findById (UUID id);

    /**
     * Retrieves all customers.
     *
     * @return A list of all customers.
     */
    List<CustomerEntity> findAll();
}
