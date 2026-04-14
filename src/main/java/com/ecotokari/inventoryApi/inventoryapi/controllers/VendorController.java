package com.ecotokari.inventoryApi.inventoryapi.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecotokari.inventoryApi.inventoryapi.dto.request.VendorRequest;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.GeneralResponse;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.VendorResponse;
import com.ecotokari.inventoryApi.inventoryapi.services.VendorService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Tag(name="Vendor")
public class VendorController {


    private final VendorService vendorService;


    @PostMapping("/addvendor")
    ResponseEntity<GeneralResponse> AddVendor(VendorRequest vendorRequest){
        return ResponseEntity.ok(vendorService.AddVendor(vendorRequest));
    }


    @PostMapping("/updateVendor")
    ResponseEntity<GeneralResponse> EditVendor(VendorRequest vendorRequest){
        return ResponseEntity.ok(vendorService.EditVendor(vendorRequest));
    }

    @PostMapping("/deleteVendor")
    ResponseEntity<GeneralResponse> DeleteVendor(VendorRequest vendorRequest){
        return ResponseEntity.ok(vendorService.DeleteVendor(vendorRequest));
    }

    @GetMapping("/getAllVendors")
    public ResponseEntity<List<VendorResponse>> getMethodName() {
        return ResponseEntity.ok(vendorService.GetAllVendors());
    }
    

     
}
