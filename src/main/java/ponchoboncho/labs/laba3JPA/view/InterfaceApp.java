package ponchoboncho.labs.laba3JPA.view;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import ponchoboncho.labs.laba3JPA.services.DepartmentService;
import ponchoboncho.labs.laba3JPA.model.Deportment;
import ponchoboncho.labs.laba3JPA.model.Employee;
import ponchoboncho.labs.laba3JPA.model.Staff;
import ponchoboncho.labs.laba3JPA.services.EmployeeService;
import ponchoboncho.labs.laba3JPA.services.StaffService;
import ponchoboncho.labs.laba3JPA.services.impl.DeportmentServiceImpl;
import ponchoboncho.labs.laba3JPA.services.impl.EmployeeServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import ponchoboncho.labs.laba3JPA.services.impl.StaffServiceImp;

import java.util.*;

@Component
public class InterfaceApp {

    @Autowired
    private EmployeeServiceImpl employeeService;
    @Autowired
    private DeportmentServiceImpl deportmentService;

    @Autowired
    private StaffServiceImp staffService;
    //private final DepartmentService departmentService;

    Gson gson = new Gson();

    Scanner in = new Scanner(System.in);
    int num;

    public void inform(){
        System.out.println("1 - Pokazat tablicu Deportment \n" +
                "2 - Sozdat Deportment\n" +
                "3 - Udalit zapis Deportment\n"+
                "4 - Pokazat tablicu Staff \n"+
                "5 - Sozdat Staff \n"+
                "6 - Udalit zapis \n"+
                "7 - Udalit zapis o Department \n"+
                "8 - Nayti zapis po pervim bukvam name (Department) \n"+
                "9 - zavershit programmu");
    }

    public void meny(){
        while (num !=9){
            inform();
            num = in.nextInt();
            if (num == 1){
                for (Deportment i:deportmentService.getAll()) {
                    System.out.printf("id: %d \t Name: %s \t number Employees: %s list rooms: %s limk head (FIO): %s \n",
                            i.getId(),
                            i.getName(),
                            i.getNumberEmployees(),
                            i.getListRooms(),
                            i.getStaff().getFio()
                    );
                }
            }
            if (num == 2){
                Deportment deportment = new Deportment();
                //Staff staff = new Staff();
                //deportment.setId(6);
                deportment.setName("qwerty");
                deportment.setNumberEmployees("2");
                deportment.setListRooms("23, 1, 22");
                deportment.setStaff(staffService.getById(1).orElse(null));
                deportmentService.addDeportment(deportment);
            }
            if (num == 3){
                deportmentService.delete(1);
            }
            if(num == 4){
                for (Staff s:staffService.getAll()){
                    System.out.printf("id: %d \t address: %s \t birthday: %s \t FIO: %s \t otdel: %s \t post: %s \n",
                    s.getId(),
                    s.getAddress(),
                    s.getBirthDay(),
                    s.getFio(),
                    s.getOtdel(),
                    s.getPost()
                    );
                }
            }
            if (num ==5){
                Staff staff = new Staff();
                staff.setAddress("qwerty");
                staff.setBirthDay("04.03.1999");
                staff.setFio("Sorokin Nikolay Yrrich");
                staff.setOtdel("IT");
                staff.setPost("Boss");
                staffService.addStaff(staff);
            }
            if (num == 6){
                staffService.delete(2);
            }
        }
    }


/*    public void meny(){
        while (num !=9){
            inform();
            num = in.nextInt();
            if (num == 1){
                System.out.println(employeeService.getEmployeeAll());
            }
            if(num == 2){
                initForCreation("employee");
                employeeService.create(
                        attributes.get(0),
                        attributes.get(1),
                        attributes.get(2),
                        attributes.get(3),
                        attributes.get(4),
                        attributes.get(5),
                        attributes.get(6));
            }
            if (num == 3){
                System.out.println("Vvedi index atributa na udalenie");
                employeeService.deleteByIndex(Integer.parseInt(in.next())-1);
            }
            if (num == 4){
                System.out.println("Vvedi na cho nachinaetsy lastName");
                System.out.println(employeeService.getFindEmployee(in.next()));
            }
            if (num == 5){
                System.out.println(departmentService.getDepormentAll());
            }
            if(num == 6){
                initForCreation("deportment");
                departmentService.create(
                        attributes.get(0),
                        Integer.parseInt(attributes.get(1)),
                        Arrays.asList(attributes.get(2).split(" "))
                );
            }
            if (num == 7){
                System.out.println("Vvedi index atributa na udalenie");
                departmentService.deleteByIndex(Integer.parseInt(in.next())-1);
            }
            if (num == 8){
                System.out.println("Vvedi na chto nachinaetsy name department");
                System.out.println(departmentService.getFindDepartment(in.next()));
            }
        }
    }*/
}
