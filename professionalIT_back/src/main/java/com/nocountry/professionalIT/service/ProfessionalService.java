package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.PersonDTO;
import com.nocountry.professionalIT.dto.UserDTO;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface ProfessionalService {

    ProfessionalEntity saveNewProfessional(PersonDTO personDTO, UserDTO userDTO);

    Page<ProfessionalEntity> findAll(int page, int size);

    ProfessionalEntity findById(UUID id);
}
