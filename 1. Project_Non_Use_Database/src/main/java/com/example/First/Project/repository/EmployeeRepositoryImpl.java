package com.example.First.Project.repository;

import com.example.First.Project.entities.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    private static final List<Employee> empList = new ArrayList<>();

    static {
        dataEmp();
    }

    private static void dataEmp() {
        Employee emp1 = new Employee(1, "A", 21);
        Employee emp2 = new Employee(2, "B", 22);
        Employee emp3 = new Employee(3, "C", 23);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
    }

    @Override
    public void deleteEmp(int empId) {
        for (Employee emp: empList) {
            if (emp.getEmpId() == empId) {
                empList.remove(emp);
                break;
            }
        }
    }

    @Override
    public void updateEmp(Employee empEdit) {
        for (Employee emp: empList) {
            if (emp.getEmpId() == empEdit.getEmpId()) {
                emp.setEmpId(empEdit.getEmpId());
                emp.setEmpName(empEdit.getEmpName());
                emp.setEmpAge(empEdit.getEmpAge());
            }
        }
    }

    @Override
    public void addEmp(Employee empNew) {
        empList.add(empNew);
    }

    @Override
    public Employee getEmp(int empId) {
        for (Employee emp: empList) {
            if (emp.getEmpId() == empId) {
                return emp;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmp() {
        return empList;
    }




}
