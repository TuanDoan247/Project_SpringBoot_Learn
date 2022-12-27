package com.example.First.Project.controller;

import com.example.First.Project.entities.Employee;
import com.example.First.Project.service.APIService;
import com.example.First.Project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController implements APIService {

    @Autowired
    EmployeeService employeeService;

    //Function delete employee
    @Override
    public String deleteEmp(int empid) {
        employeeService.deleteEmp(empid);
        return "delete successfull";
    }

    // Function update employee
    @Override
    public String updateEmp(Employee empEdit) {
        employeeService.updateEmp(empEdit);
        return "Update successfull";
    }

    // Function add employee
    @Override
    public String addEmp(@RequestBody Employee empNew) {
        employeeService.addEmp(empNew);
        return "Add successfull";
    }

    // Function view detail employee
    @Override
    public Employee viewEmp(int empId) {
        return employeeService.getEmp(empId);
    }

    // Function view all employee
    @Override
    public List<Employee> viewAllEmp() {
        List<Employee> list = employeeService.getAllEmp();
        return list;
    }
}
