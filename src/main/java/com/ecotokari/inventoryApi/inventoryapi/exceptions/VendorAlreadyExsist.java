package com.ecotokari.inventoryApi.inventoryapi.exceptions;

public class VendorAlreadyExsist extends RuntimeException{
   public VendorAlreadyExsist(String message){
     super(message);
   }
}
