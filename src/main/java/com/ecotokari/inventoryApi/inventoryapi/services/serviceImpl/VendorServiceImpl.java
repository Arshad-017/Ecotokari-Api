package com.ecotokari.inventoryApi.inventoryapi.services.serviceImpl;

import com.ecotokari.inventoryApi.inventoryapi.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecotokari.inventoryApi.inventoryapi.dto.model.ProductModel;
import com.ecotokari.inventoryApi.inventoryapi.dto.request.VendorRequest;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.GeneralResponse;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.VendorResponse;
import com.ecotokari.inventoryApi.inventoryapi.entity.Products;
import com.ecotokari.inventoryApi.inventoryapi.entity.Vendor;
import com.ecotokari.inventoryApi.inventoryapi.exceptions.VendorAlreadyExsist;
import com.ecotokari.inventoryApi.inventoryapi.exceptions.VendorNotFound;
import com.ecotokari.inventoryApi.inventoryapi.repository.VendorRepository;
import com.ecotokari.inventoryApi.inventoryapi.services.VendorService;
import com.ecotokari.inventoryApi.inventoryapi.utility.Constant;
import com.ecotokari.inventoryApi.inventoryapi.utility.VendorHelper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VendorServiceImpl implements VendorService{

    private final VendorHelper vendorHelper;
    private final VendorRepository vendorRepository;

    @Override
    public GeneralResponse AddVendor(VendorRequest vendorRequest) {
        // TODO Auto-generated method stub
        // check if vendor allready Exsist
        Vendor vendor = vendorRepository.findByVendorName(vendorRequest.getVendorName());

        if(vendor != null ){
            throw new VendorAlreadyExsist(Constant.VENDOR_ALREADY_EXSIST);
        }
        List<Products> products = vendorHelper.convertProductModelToProduct(vendorRequest.getProducts());
        vendor = vendorHelper.convertVendorRequestToVendor(vendorRequest);
        vendor.setProducts(products);
        vendorRepository.save(vendor);
        return vendorHelper.convertVendorToGeneralResponse(201, Constant.SUCCESS_ADD_VENDOR);
    }

    @Override
    public GeneralResponse EditVendor(VendorRequest vendorRequest) {
        // TODO Auto-generated method stub
        Vendor vendorReq = vendorHelper.convertVendorRequestToVendor(vendorRequest);
        Vendor vendor = vendorRepository.findByVendorName(vendorRequest.getVendorName());
        if(vendor == null){
           throw new VendorNotFound(Constant.VENDOR_DOES_NOT_EXSIST);
        }
        vendorReq.setVendorId(vendor.getVendorId());
        vendorRepository.save(vendorReq);
        return vendorHelper.convertVendorToGeneralResponse(200, Constant.VENDOR_UPDATED);
    }

    @Override
    public GeneralResponse DeleteVendor(VendorRequest vendorRequest) {
        // TODO Auto-generated method stub
        Vendor vendor = vendorRepository.findByVendorName(vendorRequest.getVendorName());
        if(vendor == null){
           throw new VendorNotFound(Constant.VENDOR_DOES_NOT_EXSIST);
        }
        vendor = vendorHelper.convertVendorRequestToVendor(vendorRequest);
        vendor.setActive(false);
        vendorRepository.save(vendor);
        return vendorHelper.convertVendorToGeneralResponse(200, Constant.DELETE_VENDOR);
    }

    @Override
    public List<VendorResponse> GetAllVendors() {
        List<VendorResponse> response =  new ArrayList<>();
        List<Vendor> vendors = vendorRepository.findAll();
        for(Vendor v : vendors){
            var vendor = new VendorResponse(v.getVendorId(),v.getVendorName() ,v.getVendorPhoneNumber(), v.isActive(), v.getVendorAddress() , vendorHelper.convertProductToProductModel(v.getProducts()));
            response.add(vendor);
        }
        return response;
    }

}
