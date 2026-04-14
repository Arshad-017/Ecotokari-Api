package com.ecotokari.inventoryApi.inventoryapi.exceptions;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ecotokari.inventoryApi.inventoryapi.dto.response.GeneralResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(VendorAlreadyExsist.class)
    ResponseEntity<GeneralResponse> VendorAlreadyExsist(Exception exception){
        return ResponseEntity.status(500).body(
            new GeneralResponse(500,exception.getMessage(),LocalDate.now())
        );
    }

    @ExceptionHandler(VendorNotFound.class)
    ResponseEntity<GeneralResponse> VendorNotFound(Exception exception){
        return ResponseEntity.status(500).body(
            new GeneralResponse(500,exception.getMessage(),LocalDate.now())
        );
    }


}
