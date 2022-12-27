package com.example.First.Project.repository;

import com.example.First.Project.entities.Employee;

import java.util.List;

public interface EmployeeRepository {

    void deleteEmp(int empId);

    void updateEmp(Employee empEdit);

    void addEmp(Employee empNew);

    Employee getEmp(int empId);

    List<Employee> getAllEmp();
}
