package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.PersonDTO;
import com.nocountry.professionalIT.dto.UserDTO;
import com.nocountry.professionalIT.entities.*;
import com.nocountry.professionalIT.enums.Gender;
import com.nocountry.professionalIT.enums.Role;
import com.nocountry.professionalIT.exception.ObjectNotFoundException;
import com.nocountry.professionalIT.repository.RecruiterRepository;
import com.nocountry.professionalIT.service.RecruiterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Implementation of the RecruiterService interface that provides
 * methods to access recruiter information.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-28
 * */
@RequiredArgsConstructor
@Service
public class RecruiterServiceImpl implements RecruiterService {

    private final RecruiterRepository recruiterRepository;

    /**
     * Saves a new recruiter based on the provided person and user data.
     *
     * @param personDTO The DTO containing the person data for the new recruiter.
     * @param userDTO The DTO containing the user data for the new recruiter.
     * @return The newly created recruiter entity.
     */
    @Override
    public RecruiterEntity saveNewRecruiter(PersonDTO personDTO, UserDTO userDTO) {

        UserEntity user = UserEntity.builder()
                .email(userDTO.getEmail())
                .role(Role.RECRUITER)
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

        RecruiterEntity recruiter = RecruiterEntity.builder()
                .person(person)
                .build();
        return recruiterRepository.save(recruiter);
    }

    /**
     * Finds a recruiter by its ID.
     *
     * @param id The ID of the recruiter to find.
     * @return The recruiter entity with the specified ID.
     * @throws ObjectNotFoundException If no recruiter is found with the given ID.
     */
    @Override
    public RecruiterEntity findById(UUID id) {
        return recruiterRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Reclutador no encontrado"));
    }

    /**
     * Retrieves all recruiters.
     *
     * @return A list of all recruiters.
     */
    @Override
    public List<RecruiterEntity> findAll() {
        return recruiterRepository.findAll();
    }
}
