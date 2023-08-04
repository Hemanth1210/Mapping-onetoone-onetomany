package com.example.project5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project5.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
