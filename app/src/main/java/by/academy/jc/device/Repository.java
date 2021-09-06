package by.academy.jc.device;

import java.io.Serializable;
import java.util.Collection;

public interface Repository <T extends Device>{

    T findById(String id);

    void add(T device);

    Collection<T> findAll();

}
