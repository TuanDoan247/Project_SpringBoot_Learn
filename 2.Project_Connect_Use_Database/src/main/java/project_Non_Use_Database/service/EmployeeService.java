package project_Non_Use_Database.service;

import project_Non_Use_Database.entities.Employee;
import project_Non_Use_Database.repository.EmployeeRepository;
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
