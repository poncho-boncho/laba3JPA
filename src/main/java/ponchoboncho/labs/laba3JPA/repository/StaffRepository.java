package ponchoboncho.labs.laba3JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ponchoboncho.labs.laba3JPA.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository <Staff, Integer> {
/*    @Query("select s from Staff s where s.fio = :fio")
    Staff findByName(@Param("name") String name);*/
}
