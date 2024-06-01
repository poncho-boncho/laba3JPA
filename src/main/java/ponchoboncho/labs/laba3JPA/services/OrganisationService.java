package ponchoboncho.labs.laba3JPA.services;

import ponchoboncho.labs.laba3JPA.model.Deportment;
import ponchoboncho.labs.laba3JPA.model.Organisation;
import ponchoboncho.labs.laba3JPA.model.Staff;

import java.util.List;

public interface OrganisationService {
    List<Organisation> getAll();

    Organisation addOrganisation (Organisation organisation);

    List<Organisation> getByName(String name);
    void delete(int id);
}
