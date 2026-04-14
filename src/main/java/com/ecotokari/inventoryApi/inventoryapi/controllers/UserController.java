package com.ecotokari.inventoryApi.inventoryapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecotokari.inventoryApi.inventoryapi.dto.request.LoginRequest;
import com.ecotokari.inventoryApi.inventoryapi.dto.request.UserRegisterRequest;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.LoginResponse;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.UserRegisterResponse;
import com.ecotokari.inventoryApi.inventoryapi.services.serviceImpl.UserServiceImpl;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Tag(name="User")
public class UserController {


    private final UserServiceImpl userServiceImpl;
    

    @PostMapping("/register")
    public UserRegisterResponse Register(@RequestBody UserRegisterRequest userRegisterRequest) {
        return userServiceImpl.RegisterUser(userRegisterRequest);
    }


    @PostMapping("/login")
    public LoginResponse Login(@RequestBody LoginRequest loginRequest) {
        return userServiceImpl.Login(loginRequest);
    }
    

}
