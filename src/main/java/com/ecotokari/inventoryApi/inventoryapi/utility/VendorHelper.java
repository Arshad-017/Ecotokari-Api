package com.ecotokari.inventoryApi.inventoryapi.utility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ecotokari.inventoryApi.inventoryapi.dto.model.ProductModel;
import com.ecotokari.inventoryApi.inventoryapi.dto.request.VendorRequest;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.GeneralResponse;
import com.ecotokari.inventoryApi.inventoryapi.entity.Products;
import com.ecotokari.inventoryApi.inventoryapi.entity.Vendor;

@Component
public class VendorHelper {


    public Vendor convertVendorRequestToVendor(VendorRequest vendorRequest){
        return new Vendor(vendorRequest.getVendorName() , vendorRequest.getVendorAddress() , vendorRequest.getVendorPhoneNumber() , true);
    }

    public GeneralResponse convertVendorToGeneralResponse(int statusCode , String message){
       return new GeneralResponse(statusCode , message , LocalDate.now());
    }

    public List<Products> convertProductModelToProduct(List<ProductModel> productModel){
        List<Products> products = new ArrayList<>();
        for(ProductModel pr : productModel){
          products.add(new Products(pr.getProductId() , pr.getProductName()));
        }
        return products;
    }

    public List<ProductModel> convertProductToProductModel(List<Products> products){
        List<ProductModel> productModel = new ArrayList<>();
        for(Products pr : products){
          productModel.add(new ProductModel(pr.getProductId() , pr.getProductName()));
        }
        return productModel;
    }

}
