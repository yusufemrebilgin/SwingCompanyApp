package service;

import dao.DAO;

public final class ModelRegistryService<T> {
    public void register(DAO<T> dao, T t) {
        dao.add(t);
    }
}