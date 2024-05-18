package ponchoboncho.labs.laba3JPA.services;

import ponchoboncho.labs.laba3JPA.model.Staff;

import java.util.List;
import java.util.Optional;

public interface StaffService {

    List<Staff> getAll();

    Staff addStaff (Staff staff);

    void delete(int id);

    //Staff getByName(String name);

    Optional<Staff> getById(Integer id);
}
