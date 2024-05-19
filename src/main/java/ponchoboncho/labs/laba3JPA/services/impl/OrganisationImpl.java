package ponchoboncho.labs.laba3JPA.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ponchoboncho.labs.laba3JPA.model.Organisation;
import ponchoboncho.labs.laba3JPA.repository.OrganisationRepository;
import ponchoboncho.labs.laba3JPA.services.OrganisationService;

import java.util.List;

@Service
@Transactional
public class OrganisationImpl implements OrganisationService {

    @Autowired
    private OrganisationRepository organisationRepository;
    @Override
    public List<Organisation> getAll() {
        return organisationRepository.findAll();
    }

    @Override
    public Organisation addOrganisation(Organisation organisation) {
        return organisationRepository.saveAndFlush(organisation);
    }

    @Override
    public void delete(int id) {
        organisationRepository.deleteById(id);
    }
}
