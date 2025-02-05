package uz.muydinovs.springdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.springdocker.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
