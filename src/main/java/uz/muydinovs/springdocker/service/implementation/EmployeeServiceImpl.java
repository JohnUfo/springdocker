package uz.muydinovs.springdocker.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import uz.muydinovs.springdocker.model.Employee;
import uz.muydinovs.springdocker.repository.EmployeeRepository;
import uz.muydinovs.springdocker.service.EmployeeService;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier(value = "postgresEmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public boolean deleteEmployeeById(Long id) {
        try {
            employeeRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
