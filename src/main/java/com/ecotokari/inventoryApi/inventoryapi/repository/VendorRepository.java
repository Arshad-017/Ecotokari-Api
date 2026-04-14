package com.ecotokari.inventoryApi.inventoryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecotokari.inventoryApi.inventoryapi.entity.Vendor;

public interface VendorRepository extends JpaRepository<Vendor , Long> {
    Vendor findByVendorName(String vendorName);
}
