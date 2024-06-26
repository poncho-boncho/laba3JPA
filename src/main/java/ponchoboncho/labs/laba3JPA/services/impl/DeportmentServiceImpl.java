package ponchoboncho.labs.laba3JPA.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ponchoboncho.labs.laba3JPA.model.Deportment;
import ponchoboncho.labs.laba3JPA.model.Staff;
import ponchoboncho.labs.laba3JPA.repository.DeportmentRepository;
import ponchoboncho.labs.laba3JPA.services.DeportmentService;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DeportmentServiceImpl implements DeportmentService {

    @Autowired
    private DeportmentRepository deportmentRepository;

    @Override
    public List<Deportment> getAll() {
        return deportmentRepository.findAll();
    }

    public List<Deportment> getByName(String name) {
        return deportmentRepository.findByName(name);
    }

    @Override
    public Deportment addDeportment(Deportment deportment) {
        return deportmentRepository.saveAndFlush(deportment);
    }

    @Override
    public void delete(int id) {
        deportmentRepository.deleteById(id);
    }

}
