package com.kienjd.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import com.kienjd.dto.response.SignInResponse;
import com.kienjd.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final JwtService jwtService;

    /**
     * Sign in the system
     * @param request
     * @return
     */
    public SignInResponse signIn(SignInRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        var user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new IllegalArgumentException("Invalid email or password"));
        var accessToken = jwtService.generateToken(user);
        return SignInResponse.builder()
                .accessToken(accessToken)
                .refreshToken("refresh_token")
                .userId(1L)
                .phoneNumber("phoneNumber")
                .role("ROLE_USER")
                .build();
    }
}
