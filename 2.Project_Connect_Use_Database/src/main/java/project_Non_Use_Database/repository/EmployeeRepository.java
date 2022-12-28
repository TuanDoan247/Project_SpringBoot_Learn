package project_Non_Use_Database.repository;

import project_Non_Use_Database.entities.Employee;
import org.springframework.data.repository.ListCrudRepository;

public interface EmployeeRepository extends ListCrudRepository<Employee, Integer> {
}
