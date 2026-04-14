package com.ecotokari.inventoryApi.inventoryapi.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRegisterResponse {

    private String username ;

    private String message ;


    public UserRegisterResponse(String username , String message){
        this.username = username;
        this.message = message;
    }

}
