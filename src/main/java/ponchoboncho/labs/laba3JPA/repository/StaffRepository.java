package ponchoboncho.labs.laba3JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ponchoboncho.labs.laba3JPA.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository <Staff, Integer> {

}
