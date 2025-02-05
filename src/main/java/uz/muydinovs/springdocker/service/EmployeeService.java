package uz.muydinovs.springdocker.service;

import uz.muydinovs.springdocker.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    Employee getEmployeeById(Integer id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Employee employee);
    boolean deleteEmployeeById(Integer id);
}
