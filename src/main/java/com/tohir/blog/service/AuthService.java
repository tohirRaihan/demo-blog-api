package com.tohir.blog.service;

import com.tohir.blog.payload.LoginDto;

public interface AuthService {

    String login(LoginDto loginDto);

}
