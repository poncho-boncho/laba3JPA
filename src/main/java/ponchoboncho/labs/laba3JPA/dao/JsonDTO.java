package ponchoboncho.labs.laba3JPA.dao;

import ponchoboncho.labs.laba3JPA.model.Employee;

public class JsonDTO {
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }
    public void setEmployees(Employee[] value){
        this.employees = value;
    }
}
