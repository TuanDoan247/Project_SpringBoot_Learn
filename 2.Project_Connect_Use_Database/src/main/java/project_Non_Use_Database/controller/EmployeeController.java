package project_Non_Use_Database.controller;

import project_Non_Use_Database.entities.Employee;
import project_Non_Use_Database.service.APIService;
import project_Non_Use_Database.service.EmployeeService;
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
