package com.ecotokari.inventoryApi.inventoryapi.services.serviceImpl;

import org.springframework.stereotype.Service;

import com.ecotokari.inventoryApi.inventoryapi.dto.request.LoginRequest;
import com.ecotokari.inventoryApi.inventoryapi.dto.request.UserRegisterRequest;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.LoginResponse;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.UserRegisterResponse;
import com.ecotokari.inventoryApi.inventoryapi.entity.UserTable;
import com.ecotokari.inventoryApi.inventoryapi.services.UserService;
import com.ecotokari.inventoryApi.inventoryapi.utility.Constant;
import com.ecotokari.inventoryApi.inventoryapi.utility.UserHelperUtil;

import lombok.RequiredArgsConstructor;

import com.ecotokari.inventoryApi.inventoryapi.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{


    private final UserRepository userRepository;
    private final UserHelperUtil userHelperUtility;

    @Override
    public UserRegisterResponse RegisterUser(UserRegisterRequest userRegisterRequest) {
        // Check if user Already Exsist
        UserTable user = userRepository.findByUserName(userRegisterRequest.getUsername());

        if(user == null){
           // return null;
        }
        user = userHelperUtility.convertUserRequestToUserTable(userRegisterRequest);
        return userHelperUtility.convertUserTableToUserRegisterResponse(userRepository.save(user));  
    }

    @Override
    public LoginResponse Login(LoginRequest loginRequest) {
        UserTable user = userRepository.findByUserName(loginRequest.getUsername());

        if(user == null){
            // Throw Exception Here
            return null;
        }

        var password = loginRequest.getPassword();
        if(password.equals(user.getPassword())){
            return new LoginResponse(
                user.getUserName(),
                "ASDDSFDSFdsfihdsiufhiushdfsfesdfs.sdfuysdfgsdf.asfdgsafsad",
                Constant.LOGIN_MESSAGE
            );
        }

        return null;

    }

}
