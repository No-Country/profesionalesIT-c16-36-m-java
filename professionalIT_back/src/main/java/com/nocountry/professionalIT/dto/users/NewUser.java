package com.nocountry.professionalIT.dto.users;

import com.nocountry.professionalIT.entities.UserEntity;
import com.nocountry.professionalIT.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewUser implements Serializable {

    private String email;
    private String role;

    public NewUser(UserEntity userEntity) {
        this.email = userEntity.getEmail();
        this.role = String.valueOf(userEntity.getRole());
    }

    public UserEntity toEntity() {
        return UserEntity.builder()
                .email(this.email)
                .role(Role.valueOf(this.role))
                .build();
    }

    private String password;

    private LocalDateTime createdDate;

}
