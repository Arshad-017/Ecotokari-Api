package com.ecotokari.inventoryApi.inventoryapi.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginResponse {

     private String username ;

     private String accessToken ;

     private String message ;

     public LoginResponse(String username , String accessToken , String message){
        this.username = username;
        this.accessToken = accessToken;
        this.message = message;
     }
}
