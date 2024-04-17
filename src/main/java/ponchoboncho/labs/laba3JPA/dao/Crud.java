package ponchoboncho.labs.laba3JPA.dao;

import java.util.List;

public interface Crud<E, K>{

    List<E> get();
    void save(E entity);

    void remove(K id);

    void remove(int id);

    void findBy(E entity);

    //void save(Employee employee);
}
