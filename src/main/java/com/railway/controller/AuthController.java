package com.railway.controller;

import com.railway.dto.LoginRequest;
import com.railway.dto.LoginResponse;
import com.railway.dto.RegisterRequest;
import com.railway.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public String register(
            @Valid @RequestBody RegisterRequest request) {

        return userService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse login(
            @RequestBody LoginRequest request) {

        String token = userService.login(request);

        return new LoginResponse(token, "Bearer");
    }

    @GetMapping("/validate")
    public String validateToken(
            @RequestHeader("Authorization") String authHeader) {

        String token = authHeader.replace("Bearer ", "");

        return userService instanceof Object
                ? "Token Received"
                : "Invalid";
    }
}