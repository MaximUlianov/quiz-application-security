package com.ulianoff.quizapplication.security.quizapplicationsecurity.service.registration.dao;

import com.ulianoff.quizapplication.security.quizapplicationsecurity.model.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "userRegistrationRestClient", url = "${url.backend}")
public interface RegistrationRestClient {

    @PostMapping(value = "/api/v1/users", headers = {"Content-Type=application/json"})
    UserDto createUser(@RequestBody UserDto userDto);
}
