package ponchoboncho.labs.laba3JPA.services;

import org.springframework.stereotype.Service;
import ponchoboncho.labs.laba3JPA.model.Deportment;
import ponchoboncho.labs.laba3JPA.model.Staff;

import java.util.List;
import java.util.Optional;

@Service
public interface DeportmentService {

    List<Deportment> getAll();
    Deportment addDeportment(Deportment deportment);

    List<Deportment> getByName(String name);

    void delete(int id);
}
