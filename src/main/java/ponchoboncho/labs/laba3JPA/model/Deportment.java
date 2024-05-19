package ponchoboncho.labs.laba3JPA.model;


import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.stereotype.Repository;


@Repository
@Entity
@Table(name = "deportment")
public class Deportment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "number_employees")
    private String numberEmployees;

    @Column(name = "list_rooms")
    private String listRooms;

    @ManyToOne(cascade = CascadeType.MERGE)
    //@OnDelete(action = OnDeleteAction.CASCADE)
    //@Column(name = "link_head")
    @JoinColumn(name = "link_head")
    private Staff staff;

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

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
