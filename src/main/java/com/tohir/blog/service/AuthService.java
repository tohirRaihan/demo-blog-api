package com.tohir.blog.service;

import com.tohir.blog.payload.LoginDto;
import com.tohir.blog.payload.RegisterDto;

public interface AuthService {

    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);

}
