package com.ecotokari.inventoryApi.inventoryapi.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="user_tbl")
public class UserTable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  @Column(name = "user_name")
  private String userName ;

  @Column(name = "password")
  private String password;

  @Column(name = "phone_number")
  private Long phoneNumber;

  @Column(name = "address")
  private String address;

  @Column(name = "pin_code")
  private Long pinCode;


  public UserTable(String userName , String password , Long phoneNumber , String address , Long pinCode){
     this.userName = userName ;
     this.password= password;
     this.phoneNumber= phoneNumber;
     this.address= address;
     this.pinCode= pinCode;
  }
}
