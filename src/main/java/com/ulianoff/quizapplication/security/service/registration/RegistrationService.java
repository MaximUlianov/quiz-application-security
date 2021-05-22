package com.ulianoff.quizapplication.security.service.registration;

import com.ulianoff.quizapplication.security.model.dto.UserDto;

public interface RegistrationService {

    String register(UserDto userDto);
}
