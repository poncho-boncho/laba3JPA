package ponchoboncho.labs.laba3JPA.services;

import org.springframework.stereotype.Service;
import ponchoboncho.labs.laba3JPA.model.Deportment;

import java.util.List;
import java.util.Optional;

@Service
public interface DeportmentService {

    List<Deportment> getAll();
    Deportment addDeportment(Deportment deportment);

    void delete(int id);
}
