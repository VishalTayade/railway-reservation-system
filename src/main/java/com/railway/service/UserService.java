package com.railway.service;

import com.railway.dto.RegisterRequest;

public interface UserService {

    String register(RegisterRequest request);
}