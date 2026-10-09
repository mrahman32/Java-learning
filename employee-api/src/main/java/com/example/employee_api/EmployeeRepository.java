package com.example.employee_api;

import java.util.Optional;

public interface EmployeeRepository extends org.springframework.data.jpa.repository.JpaRepository<Employee, Long>  {

    Optional<Employee> findByEmail(String email);
    
} 
