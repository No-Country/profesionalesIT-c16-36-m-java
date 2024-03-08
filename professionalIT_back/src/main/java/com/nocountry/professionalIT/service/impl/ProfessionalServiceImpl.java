package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.PersonDTO;
import com.nocountry.professionalIT.dto.UserDTO;
import com.nocountry.professionalIT.entities.PersonEntity;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import com.nocountry.professionalIT.entities.UserEntity;
import com.nocountry.professionalIT.enums.Role;
import com.nocountry.professionalIT.repository.ProfessionalRepository;
import com.nocountry.professionalIT.service.ProfessionalService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProfessionalServiceImpl implements ProfessionalService {

    private final ProfessionalRepository professionalRepository;

    @Override
    public ProfessionalEntity saveNewProfessional(PersonDTO personDTO, UserDTO userDTO) {

        UserEntity user = UserEntity.builder()
                .email(userDTO.getEmail())
                .role(Role.PROFESSIONAL)
                .build();

        PersonEntity person = PersonEntity.builder()
                .user(user)
                .name(personDTO.getName())
                .lastName(personDTO.getLastName())
                .img(personDTO.getImg())
                .build();

        ProfessionalEntity professional = ProfessionalEntity.builder()
                .person(person)
                .build();
        return professionalRepository.save(professional);
    }

    @Override
    public Page<ProfessionalEntity> findAll(int page, int size) {
        return professionalRepository.findAll(PageRequest.of(page, size));
    }
}
