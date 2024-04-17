package ponchoboncho.labs.laba3JPA.model;

//import jakarta.persistence.*;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

@Repository
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "name")
    private String name;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "address")
    private String address;
    @Column(name = "department")
    private String department;
    @Column(name = "birth_day")
    private String birthDay;
    @Column(name = "post")
    private String post;

    public Integer getId() {
        return id;
    }

/*    public Employee(Integer id, String lastName, String name, String middleName, String address, String department, String birthDay, String post) {
        this.id = id;
        this.lastName = lastName;
        this.name=name;
        this.middleName=middleName;
        this.address = address;
        this.department = department;
        this.birthDay = birthDay;
        this.post = post;
    }*/

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFio(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPost() {
        return post;
    }

    public void create(){

    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
