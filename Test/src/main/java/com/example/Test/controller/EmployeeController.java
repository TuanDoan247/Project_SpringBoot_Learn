package com.example.Test.controller;

import com.example.Test.entities.Employee;
import com.example.Test.service.APIService;
import com.example.Test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController implements APIService {

    @Autowired
    EmployeeService employeeService;

    @Override
    public List<Employee> viewAllEmp() {
        List<Employee> list = employeeService.getAllEmp();
        return list;
    }
}
