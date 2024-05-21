package ponchoboncho.labs.laba3JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ponchoboncho.labs.laba3JPA.model.Deportment;
import ponchoboncho.labs.laba3JPA.model.Organisation;

@Repository
public interface OrganisationRepository extends JpaRepository <Organisation, Integer> {
    @Query("select o from Organisation o where substring(o.name,1,length(:name))  = :name ")
    Organisation findByName(@Param("name") String name);
}
