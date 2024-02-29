package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.PersonDTO;
import com.nocountry.professionalIT.dto.UserDTO;
import com.nocountry.professionalIT.entities.RecruiterEntity;

public interface RecruiterService {

    RecruiterEntity saveNewRecruiter(PersonDTO personDTO, UserDTO userDTO);
}
