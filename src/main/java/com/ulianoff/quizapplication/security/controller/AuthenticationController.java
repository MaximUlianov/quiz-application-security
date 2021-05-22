package com.ulianoff.quizapplication.security.controller;

import com.ulianoff.quizapplication.security.model.dto.LoginDto;
import com.ulianoff.quizapplication.security.model.dto.UserDto;
import com.ulianoff.quizapplication.security.security.service.AuthenticationService;
import com.ulianoff.quizapplication.security.service.registration.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    @PreAuthorize("hasRole('ROLE_USER')")
    public String get() {

        return "Nice";
    }
}
