package dao;

import java.util.List;

public interface DAO<T> {
        List<T> getAll();
        void add(T entity);
        void update(T entity);
        void delete(int id);
}