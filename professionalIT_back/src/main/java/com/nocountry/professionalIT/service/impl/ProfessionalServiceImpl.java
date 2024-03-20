package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.users.NewPerson;
import com.nocountry.professionalIT.dto.users.NewUser;
import com.nocountry.professionalIT.entities.PersonEntity;
import com.nocountry.professionalIT.entities.ProfessionalEntity;
import com.nocountry.professionalIT.entities.UserEntity;
import com.nocountry.professionalIT.enums.Role;
import com.nocountry.professionalIT.repository.ProfessionalRepository;
import com.nocountry.professionalIT.service.ProfessionalService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class ProfessionalServiceImpl implements ProfessionalService {

    private final ProfessionalRepository professionalRepository;

    @Override
    public ProfessionalEntity saveNewProfessional(NewPerson newPerson, NewUser newUser) {

        UserEntity user = UserEntity.builder()
                .email(newUser.getEmail())
                .role(Role.PROFESSIONAL)
                .build();

        PersonEntity person = PersonEntity.builder()
                .user(user)
                .name(newPerson.getName())
                .lastName(newPerson.getLastName())
                .img(newPerson.getImg())
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

    @Override
    public ProfessionalEntity findById(UUID id) {
        return professionalRepository.findById(id)
                .orElseThrow(() -> new  EntityNotFoundException("Profesional no encontrado"));
    }
}
