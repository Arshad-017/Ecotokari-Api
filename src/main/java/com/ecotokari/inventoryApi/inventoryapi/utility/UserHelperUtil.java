package com.ecotokari.inventoryApi.inventoryapi.utility;

import org.springframework.stereotype.Component;

import com.ecotokari.inventoryApi.inventoryapi.dto.request.UserRegisterRequest;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.UserRegisterResponse;
import com.ecotokari.inventoryApi.inventoryapi.entity.UserTable;


@Component
public class UserHelperUtil {

    public UserTable convertUserRequestToUserTable(UserRegisterRequest userRegisterRequest){
        return new UserTable(
            userRegisterRequest.getUsername() , userRegisterRequest.getPassword() , userRegisterRequest.getPhoneNumber() ,userRegisterRequest.getAddress(), userRegisterRequest.getPinCode()
        );
    }

    public UserRegisterResponse convertUserTableToUserRegisterResponse(UserTable userTable){
       return new UserRegisterResponse(userTable.getUserName() , Constant.REGISTER_USER);
    }

}
