package com.ulianoff.quizapplication.security.quizapplicationsecurity.security.service;

import com.ulianoff.quizapplication.security.quizapplicationsecurity.model.dto.LoginDto;

public interface AuthenticationService {

    String login(LoginDto loginDto);
}
