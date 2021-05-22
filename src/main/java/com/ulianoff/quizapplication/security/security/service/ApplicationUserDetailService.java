package com.ulianoff.quizapplication.security.security.service;

import com.ulianoff.quizapplication.security.model.dto.AuthDto;
import com.ulianoff.quizapplication.security.security.dao.UserAuthenticationRestClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
@Slf4j
public class ApplicationUserDetailService implements UserDetailsService {

    private final UserAuthenticationRestClient restClient;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        AuthDto authDto = restClient.getAuthByUsername(username);
        if (authDto == null) {
            throw new UsernameNotFoundException("User not found.");
        }

        return new org.springframework.security.core.userdetails.User(
                authDto.getUsername(), authDto.getPassword(), getAuthority(authDto));
    }

    private Set<GrantedAuthority> getAuthority(AuthDto authDto) {
        Set<GrantedAuthority> authorities = new HashSet<>();

        authorities.add(new SimpleGrantedAuthority(authDto.getRole().toString()));
        return authorities;
    }
}
