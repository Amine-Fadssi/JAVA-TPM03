package tp03;

import java.util.List;

public interface IMetier<T> {
    void add(T p);
    List<T> getAll();

    T findById(int id);
    void delete(int id);
}
