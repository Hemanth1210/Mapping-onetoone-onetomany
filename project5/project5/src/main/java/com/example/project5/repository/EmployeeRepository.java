package com.example.project5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project5.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
