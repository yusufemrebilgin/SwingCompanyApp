package service;

import dao.DAO;

public final class ModelUpdateService<T> {
    public void update(DAO<T> dao, T t) {
        dao.update(t);
    }
}