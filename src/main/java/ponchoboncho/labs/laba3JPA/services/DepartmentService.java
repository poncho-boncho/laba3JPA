package ponchoboncho.labs.laba3JPA.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import ponchoboncho.labs.laba3JPA.model.Department;
//import ponchoboncho.labs.laba3JPA.repository.DepartmentRepository;

import java.util.List;
/*

@Service
public class DepartmentService {
*/
/*
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    public String getDepormentAll(){
        StringBuilder qwerty = new StringBuilder();
        for(Department department: departmentRepository.get()){
            qwerty.append("ID = ").append(department.getId());
            qwerty.append("\tName = "+department.getName());
            qwerty.append("\t EmployeNumbers = "+department.getEmployeNumbers());
            qwerty.append("\t ListRomms = "+department.getListRomms());
            qwerty.append("\n");
        }
        return qwerty.toString();
    }

    public void create(
            String name,
            Integer employeNumbers,
            List<String> listRomms
    ){
        departmentRepository.save(new Department(departmentRepository.getCOUNT(),name,employeNumbers, listRomms));
    }

    public void deleteByIndex(int index){
        departmentRepository.remove(index);
    }

    public String getFindDepartment(String ch){
        StringBuilder qwerty = new StringBuilder();
        for (Department department: departmentRepository.get()){
            if (department.getName().startsWith(ch)){
                qwerty.append("ID = ").append(department.getId());
                qwerty.append("\tName = "+department.getName());
                qwerty.append("\tEmployeNumbers = "+department.getEmployeNumbers());
                qwerty.append("\tMiddleName = "+department.getListRomms());
                qwerty.append("\n");
            }
        }
        return qwerty.toString();
    }*//*

}
*/
