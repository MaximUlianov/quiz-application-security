package com.ulianoff.quizapplication.security.quizapplicationsecurity.service.registration;

import com.ulianoff.quizapplication.security.quizapplicationsecurity.model.dto.UserDto;

public interface RegistrationService {

    String register(UserDto userDto);
}
