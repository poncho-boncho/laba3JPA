package ponchoboncho.labs.laba3JPA.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ponchoboncho.labs.laba3JPA.model.Employee;
import ponchoboncho.labs.laba3JPA.repository.EmployeeRepository;
import ponchoboncho.labs.laba3JPA.services.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.saveAndFlush(employee);

        return savedEmployee;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
