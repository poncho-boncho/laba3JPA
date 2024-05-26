package ponchoboncho.labs.laba3JPA.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ponchoboncho.labs.laba3JPA.view.InterfaceApp;

@Service
public class AppService {
    //private final EmployeeService employeeService;
    @Autowired
    private InterfaceApp interfaceApp;

    @Autowired
    public AppService(InterfaceApp interfaceApp){
        //this.interfaceApp = interfaceApp;
        interfaceApp.meny();
    }

}
