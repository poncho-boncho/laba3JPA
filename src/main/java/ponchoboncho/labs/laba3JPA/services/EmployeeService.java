package ponchoboncho.labs.laba3JPA.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ponchoboncho.labs.laba3JPA.model.Employee;
import ponchoboncho.labs.laba3JPA.repository.EmployeeRepository;

import java.util.List;

@Service
public interface EmployeeService {

   // void create (Employee employee);

    Employee addEmployee(Employee employee);

    List<Employee> getAll();

    /*
    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public void create(
            String lastName,
            String name,
            String middleName,
            String address,
            String department,
            String birthDay,
            String post
    ){
        employeeRepository.save(new Employee(employeeRepository.getCOUNT(), lastName,name,middleName,address,department,birthDay,post));
    }

    public void deleteByIndex(int index){
        employeeRepository.remove(index);
    }
    public String getFindEmployee(String ch){
        StringBuilder qwerty = new StringBuilder();
        for (Employee emploe: employeeRepository.get()){
            if (emploe.getLastName().startsWith(ch)){
                qwerty.append("ID = ").append(emploe.getId());
                qwerty.append("\tLastName = "+emploe.getLastName());
                qwerty.append("\tName = "+emploe.getName());
                qwerty.append("\tMiddleName = "+emploe.getMiddleName());
                qwerty.append("\tAddress = "+emploe.getAddress());
                qwerty.append("\tDepartament = "+emploe.getDepartment());
                qwerty.append("\tPost = "+emploe.getPost());
                qwerty.append("\tBirthDay = " +emploe.getBirthDay());
                qwerty.append("\n");
            }
        }
        return qwerty.toString();
    }
    public String getEmployeeAll(){
        StringBuilder qwerty = new StringBuilder();
        for (Employee emploe: employeeRepository.get()){
            qwerty.append("ID = ").append(emploe.getId());
            qwerty.append("\tLastName = "+emploe.getLastName());
            qwerty.append("\tName = "+emploe.getName());
            qwerty.append("\tMiddleName = "+emploe.getMiddleName());
            qwerty.append("\tAddress = "+emploe.getAddress());
            qwerty.append("\tDepartament = "+emploe.getDepartment());
            qwerty.append("\tPost = "+emploe.getPost());
            qwerty.append("\tBirthDay = " +emploe.getBirthDay());
            qwerty.append("\n");
        }
        return qwerty.toString();
    }*/

}
