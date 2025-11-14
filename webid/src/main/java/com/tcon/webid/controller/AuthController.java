package com.tcon.webid.controller;

import com.tcon.webid.domain.AuthRequest;
import com.tcon.webid.domain.AuthResponse;
import com.tcon.webid.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        return authService.authenticate(request);
    }
}
