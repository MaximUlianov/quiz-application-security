package com.ulianoff.quizapplication.security.security.dao;

import com.ulianoff.quizapplication.security.model.dto.AuthDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userAuthenticationRestClient", url = "${url.backend}")
public interface UserAuthenticationRestClient {

    @GetMapping(value = "/api/v1/auths/{username}", headers = {"Content-Type=application/json"})
    AuthDto getAuthByUsername(@PathVariable("username") String username);
}
