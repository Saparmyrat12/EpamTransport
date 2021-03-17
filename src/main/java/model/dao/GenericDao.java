package model.dao;

public interface GenericDao<E> {
    void create(E e);
    void update(E e, int id);
    void delete(int id);
}
