package ponchoboncho.labs.laba3JPA.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ponchoboncho.labs.laba3JPA.model.Employee;
import ponchoboncho.labs.laba3JPA.services.EmployeeService;
import ponchoboncho.labs.laba3JPA.services.impl.EmployeeServiceImpl;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;

    @Autowired
    public EmployeeController (EmployeeServiceImpl employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping (value = "employees")
    public ResponseEntity<?> create(Employee employee){
        employeeService.addEmployee(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value = "employees")
    public ResponseEntity<List<Employee>> read() {
        final List<Employee> employees = employeeService.getAll();

        return employees != null &&  !employees.isEmpty()
                ? new ResponseEntity<>(employees, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
