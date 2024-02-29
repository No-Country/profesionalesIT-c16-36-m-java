package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.PersonDTO;
import com.nocountry.professionalIT.dto.UserDTO;
import com.nocountry.professionalIT.entities.RecruiterEntity;

import java.util.List;
import java.util.UUID;

public interface RecruiterService {

    RecruiterEntity saveNewRecruiter(PersonDTO personDTO, UserDTO userDTO);

    RecruiterEntity findById (UUID id);

    List<RecruiterEntity> findAll ();
}
