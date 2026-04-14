package com.ecotokari.inventoryApi.inventoryapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRegisterRequest {
 
     private String username ;

     private String password ;

     private String address ;
      
     private Long phoneNumber;

     private Long pinCode;
}
