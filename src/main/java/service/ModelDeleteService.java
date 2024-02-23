package service;

import dao.DAO;

public final class ModelDeleteService<T> {
    public void delete(DAO<T> dao, int id) {
        dao.delete(id);
    }
}