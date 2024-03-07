package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    public Optional<UserEntity> findByEmail(String email);

    // Definir una consulta personalizada para recuperar correos electrónicos de usuarios con el rol "admin"
    @Query("SELECT u.email FROM UserEntity u WHERE u.role = 'ADMIN'")
    List<String> getAllAdminEmails();
}
