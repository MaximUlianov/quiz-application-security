package com.ulianoff.quizapplication.security.quizapplicationsecurity.controller;

import com.ulianoff.quizapplication.security.quizapplicationsecurity.model.dto.LoginDto;
import com.ulianoff.quizapplication.security.quizapplicationsecurity.model.dto.UserDto;
import com.ulianoff.quizapplication.security.quizapplicationsecurity.security.service.AuthenticationService;
import com.ulianoff.quizapplication.security.quizapplicationsecurity.service.registration.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    private final RegistrationService registrationService;

    @PostMapping("/login")
    public String login(@RequestBody @Valid LoginDto loginDto) {

        return authenticationService.login(loginDto);
    }

    @PostMapping("/register")
    public String register(@RequestBody @Valid UserDto userDto) {

        return registrationService.register(userDto);
    }
}
