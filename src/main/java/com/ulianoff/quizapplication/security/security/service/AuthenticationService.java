package com.ulianoff.quizapplication.security.security.service;

import com.ulianoff.quizapplication.security.model.dto.LoginDto;

public interface AuthenticationService {

    String login(LoginDto loginDto);
}
