package com.example.Test.service;

import com.example.Test.entities.Employee;
import com.example.Test.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmp() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }
}
