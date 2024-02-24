package service;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.Dashboard;

public final class DisplayService<T> {
    public void displayData(List<T> data, JTable table, TableConfig<T> tableConfig) {
        DefaultTableModel model = Dashboard.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        
        String[] columns = tableConfig.getColumnNames();
        for (String s: columns)
            model.addColumn(s);
        
        for (T t: data)
            model.addRow(tableConfig.getRowData(t));
        
        Dashboard.setModel(model);
        table.setModel(model);
    }
}
