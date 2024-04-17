package ponchoboncho.labs.laba3JPA.model;


import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Entity
@Table(name = "deportment")
public class Deportment {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "number_employees")
    private String numberEmployees;

    @Column(name = "list_rooms")
    private String listRooms;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "link_head")
   // @JoinColumn(name = "id")
    private List<Staff> staffs = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(String numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public String getListRooms() {
        return listRooms;
    }

    public void setListRooms(String listRooms) {
        this.listRooms = listRooms;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }
}
