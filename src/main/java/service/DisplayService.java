package service;

import java.util.List;
import javax.swing.JTable;

public interface DisplayService<T> {
    void displayData(List<T> t, JTable table);
}