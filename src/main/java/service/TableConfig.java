package service;

public interface TableConfig<T> {
    String[] getColumnNames();
    Object[] getRowData(T t);
}