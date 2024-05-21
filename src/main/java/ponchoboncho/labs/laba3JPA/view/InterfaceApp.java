package ponchoboncho.labs.laba3JPA.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import ponchoboncho.labs.laba3JPA.services.DepartmentService;
import org.springframework.transaction.annotation.Transactional;
import ponchoboncho.labs.laba3JPA.model.Deportment;
import ponchoboncho.labs.laba3JPA.model.Organisation;
import ponchoboncho.labs.laba3JPA.model.Staff;
import ponchoboncho.labs.laba3JPA.services.impl.DeportmentServiceImpl;
import ponchoboncho.labs.laba3JPA.services.impl.OrganisationImpl;
import ponchoboncho.labs.laba3JPA.services.impl.StaffServiceImp;

import java.util.*;

@Component
public class InterfaceApp {

    @Autowired
    private DeportmentServiceImpl deportmentService;

    @Autowired
    private OrganisationImpl organisationService;

    @Autowired
    private StaffServiceImp staffService;

    Scanner in = new Scanner(System.in);
    int num;

    public void inform(){
        System.out.println("1 - Pokazat tablicu Deportment \n" +
                "2 - Sozdat Deportment\n" +
                "3 - Udalit zapis Deportment\n"+
                "4 - Pokazat tablicu Staff \n"+
                "5 - Sozdat Staff \n"+
                "6 - Udalit zapis Staff \n"+
                "7 - Pokazat tablicu Organisation \n"+
                "8 - Sozdat Organisation \n"+
                "9 - Udalit zapis Organisation");
    }

    public void meny(){
        while (num !=10){
            inform();
            num = in.nextInt();
            if (num == 1){
                System.out.println("1 - pokazat vseh \n 2 - pokazat po pervim bukvam vvoda FIO");
                in.nextInt();
                if (num==1) {
                    for (Deportment i : deportmentService.getAll()) {
                        System.out.printf("id: %d \t Name: %s \t number Employees: %s list rooms: %s link head (FIO): %s \n",
                                i.getId(),
                                i.getName(),
                                i.getNumberEmployees(),
                                i.getListRooms(),
                                i.getStaff().getFio()
                        );
                    }
                } else {
                    System.out.println("Vvedi pervie bukvi name");
                    in.nextLine();
                    String name = in.nextLine();
                    if (deportmentService.getByName(name)==null) {
                        System.out.println("Takih net!!");
                    }
                    else System.out.println(deportmentService.getByName(name).getName());
                }
            }
            if (num == 2){
                Deportment deportment = new Deportment();
                in.nextLine();
                System.out.println("Vvedite name otdela");
                deportment.setName(in.nextLine());
                System.out.println("Vvedite kolichestvo sotrudnikov: ");
                deportment.setNumberEmployees(in.nextLine());
                System.out.println("Vvedite nomera komnat ");
                deportment.setListRooms(in.nextLine());
                while (deportment.getStaff()==null){
                    System.out.println("Vvedite suhestvuishiy id nachalnika");
                    deportment.setStaff(staffService.getById(in.nextInt()).orElse(null));
                }
                deportmentService.addDeportment(deportment);
            }
            if (num == 3){
                System.out.println("Vedite id:");
                deportmentService.delete(in.nextInt());
            }
            if(num == 4){
                System.out.println("1 - pokazat vseh \n 2 - pokazat po pervim bukvam vvoda FIO");
                in.nextInt();
                if (num == 1){
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
                } else {
                    System.out.println("Vvedi pervie bukvi FIO");
                    in.nextLine();
                    String fio = in.nextLine();
                    if (staffService.getByName(fio)==null) {
                        System.out.println("Takih net!!");
                    }
                    else System.out.println(staffService.getByName(fio).getFio());
                }
            }
            if (num ==5){
                Staff staff = new Staff();
                in.nextLine();
                System.out.println("vvedite adress: ");
                staff.setAddress(in.nextLine());
                System.out.println("vvedite den' rojdeniya ");
                staff.setBirthDay(in.nextLine());
                System.out.println("vvedite FIO ");
                staff.setFio(in.nextLine());
                System.out.println("vvedite Naimenovanie otdela");
                staff.setOtdel(in.nextLine());
                System.out.println("vvedite doljnost");
                staff.setPost(in.nextLine());
                staffService.addStaff(staff);
            }
            if (num == 6){
                System.out.println("vvedi id na udalenie:");
                staffService.delete(in.nextInt());
            }
            if (num == 7){
                System.out.println("1 - pokazat vseh \n 2 - pokazat po pervim bukvam vvoda FIO");
                in.nextInt();
                if (num==1) {
                    for (Organisation o:organisationService.getAll()) {
                        System.out.printf("id: %d \t address: %s \t name: %s link head (FIO): %s \n",
                                o.getId(),
                                o.getAddress(),
                                o.getName(),
                                o.getStaff().getFio()
                        );
                    }
                } else {
                    System.out.println("Vvedi pervie bukvi name");
                    in.nextLine();
                    String name = in.nextLine();
                    if (organisationService.getByName(name)==null) {
                        System.out.println("Takih net!!");
                    }
                    else System.out.println(organisationService.getByName(name).getName());
                }
            }
            if (num == 8){

                Organisation organisation = new Organisation();
                in.nextLine();
                System.out.println("vvedite adress: ");
                organisation.setAddress(in.nextLine());
                System.out.println("vvedite Nazvanie");
                organisation.setName(in.nextLine());
                while (organisation.getStaff()==null) {
                    System.out.println("Vvedite suhestvuishiy id nachalnika");
                    organisation.setStaff(staffService.getById(in.nextInt()).orElse(null));
                }
                organisationService.addOrganisation(organisation);
            }
            if (num == 9){
                System.out.println("Vedite id:");
                organisationService.delete(in.nextInt());
            }
            if(num ==20){

                //staffService.getByName(fio);
            }
        }
    }
}
