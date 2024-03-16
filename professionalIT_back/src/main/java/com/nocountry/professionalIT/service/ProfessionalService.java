package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.users.NewPerson;
import com.nocountry.professionalIT.dto.users.NewUser;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface ProfessionalService {

    ProfessionalEntity saveNewProfessional(NewPerson newPerson, NewUser newUser);

    Page<ProfessionalEntity> findAll(int page, int size);

    ProfessionalEntity findById(UUID id);
}
