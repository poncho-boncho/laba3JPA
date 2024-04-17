package ponchoboncho.labs.laba3JPA.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

@Repository
@Entity
@Table(name = "staff")
public class Staff {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "fio")
    private String fio;

    @Column(name = "address")
    private String address;

    @Column(name = "otdel")
    private String otdel;

    @Column(name = "birth_day")
    private String birthDay;

    @Column(name = "post")
    private String post;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
