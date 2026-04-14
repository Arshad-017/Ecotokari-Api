package com.ecotokari.inventoryApi.inventoryapi.services;

import java.util.List;

import com.ecotokari.inventoryApi.inventoryapi.dto.request.VendorRequest;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.GeneralResponse;
import com.ecotokari.inventoryApi.inventoryapi.dto.response.VendorResponse;

public interface VendorService {

   public GeneralResponse AddVendor(VendorRequest vendorRequest);

   public GeneralResponse EditVendor(VendorRequest vendorRequest);

   public GeneralResponse DeleteVendor(VendorRequest vendorRequest);

   public List<VendorResponse> GetAllVendors();

}
