package com.example.First.Project.service;

import com.example.First.Project.entities.Employee;
import com.example.First.Project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void deleteEmp(int empId){
        employeeRepository.deleteEmp(empId);
    }

    public void updateEmp(Employee empEdit) {
        employeeRepository.updateEmp(empEdit);
    }

    public void addEmp(Employee empNew) {
        employeeRepository.addEmp(empNew);
    }

    public Employee getEmp(int empId) {
        return employeeRepository.getEmp(empId);
    }

    public List<Employee> getAllEmp() {
        return employeeRepository.getAllEmp();
    }
}
