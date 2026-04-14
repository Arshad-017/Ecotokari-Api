package com.ecotokari.inventoryApi.inventoryapi.dto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {

    private Long productId;

    private String productName;
}
