package com.nocountry.professionalIT.dto.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * This class represents a DTO to get a UserEntity.
 *
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-03-16
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetUser implements Serializable {

    private String email;
}
