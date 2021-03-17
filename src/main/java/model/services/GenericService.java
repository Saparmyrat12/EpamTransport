package model.services;

import java.util.List;


public interface GenericService<E> {
    List<E> getAll() ;
    void create(E e);
    void update(E e, int id);
    void delete(int id) ;
}
