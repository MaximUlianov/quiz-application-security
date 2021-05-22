package com.ulianoff.quizapplication.security.service.registration;

import com.ulianoff.quizapplication.security.model.dto.LoginDto;
import com.ulianoff.quizapplication.security.model.dto.UserDto;
import com.ulianoff.quizapplication.security.security.service.AuthenticationService;
import com.ulianoff.quizapplication.security.service.registration.dao.RegistrationRestClient;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final AuthenticationService authenticationService;

    private final RegistrationRestClient restClient;

    private final BCryptPasswordEncoder encoder;

    @Override
    public String register(UserDto userDto) {

        String username = userDto.getUsername();
        String password = userDto.getPassword();
        userDto.setPassword(encoder.encode(password));

        restClient.createUser(userDto);

        return authenticationService.login(new LoginDto(username, password));
    }
}
