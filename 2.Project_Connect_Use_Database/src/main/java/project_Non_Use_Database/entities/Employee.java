package project_Non_Use_Database.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @Column(name = "Id", nullable = true)
    private int empId;
    @Column(name = "Name", nullable = true, length = 45)
    private String empName;
    @Column(name = "Age", nullable = true)
    private int empAge;

    public Employee() {
    }

    public Employee(int empId, String empName, int empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}
