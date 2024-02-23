package service;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Office;
import view.Dashboard;

public class OfficeDisplayService implements DisplayService<Office> {

    @Override
    public void displayData(List<Office> offices, JTable table) {
        String[] columns = {
            "Office Code","Address","Phone Number"
        };
        DefaultTableModel model = new DefaultTableModel();
        
        for (String s: columns)
            model.addColumn(s);
        
        for (Office o: offices) {
            model.addRow(new Object[] {
                o.getOfficeCode(),
                o.getOfficeAddress(),
                o.getOfficePhoneNumber()
            });
        }
        Dashboard.setModel(model);
        table.setModel(model);
    }
    
}