package com.nocountry.professionalIT.dto;

import com.nocountry.professionalIT.entities.UserEntity;
import com.nocountry.professionalIT.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String email;
    private String role;

    public UserDTO(UserEntity userEntity) {
        this.email = userEntity.getEmail();
        this.role = String.valueOf(userEntity.getRole());
    }

    public UserEntity toEntity() {
        return UserEntity.builder()
                .email(this.email)
                .role(Role.valueOf(this.role))
                .build();
    }

}
