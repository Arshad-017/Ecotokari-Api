package com.ecotokari.inventoryApi.inventoryapi.dto.request;

import java.util.List;

import com.ecotokari.inventoryApi.inventoryapi.dto.model.ProductModel;
import com.ecotokari.inventoryApi.inventoryapi.entity.Products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorRequest {

    private String vendorName;

    private String vendorAddress;

    private Long vendorPhoneNumber;

    private List<ProductModel> products;

}
