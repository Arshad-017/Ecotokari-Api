package com.ecotokari.inventoryApi.inventoryapi.dto.response;

import java.util.List;

import com.ecotokari.inventoryApi.inventoryapi.dto.model.ProductModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorResponse {

    private Long vendorId;

    private String vendorName;

    private Long phoneNumber ;

    private boolean isActive;

    private String address;

    private List<ProductModel> products;

}
