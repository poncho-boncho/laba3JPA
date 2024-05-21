package ponchoboncho.labs.laba3JPA.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ponchoboncho.labs.laba3JPA.model.Staff;
import ponchoboncho.labs.laba3JPA.repository.StaffRepository;
import ponchoboncho.labs.laba3JPA.services.StaffService;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StaffServiceImp implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public List<Staff> getAll() {
        return staffRepository.findAll();
    }

    @Override
    public Staff addStaff(Staff staff) {
        return staffRepository.saveAndFlush(staff);
    }

    @Override
    public void delete(int id) {
        staffRepository.deleteById(id);
    }

    @Override
    public Staff getByName(String name) {
        return staffRepository.findByName(name);
    }

    @Override
    public Optional<Staff> getById(Integer id) {
        return staffRepository.findById(id);
    }

}
