package com.ulianoff.quizapplication.security.model.dto;

import com.ulianoff.quizapplication.security.model.enums.RoleEnum;
import lombok.Data;

@Data
public class AuthDto {

    private String username;

    private String password;

    private String email;

    private RoleEnum role;
}
