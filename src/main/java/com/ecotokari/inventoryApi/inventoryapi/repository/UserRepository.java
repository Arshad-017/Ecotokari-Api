package com.ecotokari.inventoryApi.inventoryapi.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecotokari.inventoryApi.inventoryapi.entity.UserTable;


@Repository
public interface UserRepository extends JpaRepository<UserTable , Long>{
    public UserTable findByUserName(String username);
}
