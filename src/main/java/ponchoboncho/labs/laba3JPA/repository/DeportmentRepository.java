package ponchoboncho.labs.laba3JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ponchoboncho.labs.laba3JPA.model.Deportment;

@Repository
public interface DeportmentRepository extends JpaRepository <Deportment , Integer> {
}
