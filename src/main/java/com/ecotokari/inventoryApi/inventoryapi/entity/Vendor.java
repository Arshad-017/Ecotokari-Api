package com.ecotokari.inventoryApi.inventoryapi.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="vendor_tbl")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vendor_id")
    private Long vendorId ;

    @Column(name="name")
    private String vendorName;

    @Column(name="address")
    private String vendorAddress;

    @Column(name="is_active")
    private boolean isActive;

    @Column(name="phone_number")
    private Long vendorPhoneNumber;

    @OneToMany
    @JoinColumn()
    private List<Products> products;

    public Vendor(String vendorName , String vendorAddress , Long vendorPhoneNumber , boolean isActive){
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
        this.isActive = isActive ;
    }

}
