package com.ulianoff.quizapplication.security.quizapplicationsecurity.model.dto;

import lombok.Data;

@Data
public class UserDto {

    private String id;

    private String username;

    private String password;

    private String email;

    private String roomId;
}
