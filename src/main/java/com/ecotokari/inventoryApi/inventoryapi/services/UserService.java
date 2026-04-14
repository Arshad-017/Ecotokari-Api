package com.ecotokari.inventoryApi.inventoryapi.services;

import com.ecotokari.inventoryApi.inventoryapi.dto.request.LoginRequest;
import com.ecotokari.inventoryApi.inventoryapi.dto.request.UserRegisterRequest;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.LoginResponse;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.UserRegisterResponse;

public interface UserService {
    UserRegisterResponse RegisterUser(UserRegisterRequest userRegisterRequest);

    LoginResponse Login(LoginRequest loginRequest);

}
