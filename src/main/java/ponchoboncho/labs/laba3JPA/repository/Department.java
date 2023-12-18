package ponchoboncho.labs.laba3JPA.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Department {

    private int id;
    private String name;

    private Integer employeNumbers;

    private List<String> listRomms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmployeNumbers() {
        return employeNumbers;
    }

    public void setEmployeNumbers(Integer employeNumbers) {
        this.employeNumbers = employeNumbers;
    }

    public List<String> getListRomms() {
        return listRomms;
    }

    public void setListRomms(List<String> listRomms) {
        this.listRomms = listRomms;
    }

    public Integer getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
