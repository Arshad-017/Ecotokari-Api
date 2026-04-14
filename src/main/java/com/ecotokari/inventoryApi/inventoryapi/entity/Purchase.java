package com.ecotokari.inventoryApi.inventoryapi.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "purchase_tbl")
public class Purchase {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "purchase_id")
    private Long purchaseId;

    @Column(name="quantity")
    private Long quantity ;

    @Column(name="purchase_date")
    private LocalDate purchaseDate;

    @Column(name="vendor_name")
    private String vendorName ;

    @Column(name = "rate_per_piece")
    private Long ratePerPiece ;

}
