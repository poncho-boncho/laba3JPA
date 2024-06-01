package ponchoboncho.labs.laba3JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ponchoboncho.labs.laba3JPA.model.Deportment;
import ponchoboncho.labs.laba3JPA.model.Staff;

import java.util.List;

@Repository
public interface DeportmentRepository extends JpaRepository <Deportment , Integer> {
    @Query("select d from Deportment d where substring(d.name,1,length(:name))  = :name ")
    List<Deportment> findByName(@Param("name") String name);
}
