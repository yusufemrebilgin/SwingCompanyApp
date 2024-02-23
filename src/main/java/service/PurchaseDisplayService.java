package service;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Purchase;
import view.Dashboard;

public class PurchaseDisplayService implements DisplayService<Purchase> {

    @Override
    public void displayData(List<Purchase> purchases, JTable table) {
        String[] columns = {
            "Customer Id","Total Amount","Purchase Date"
        };
        DefaultTableModel model = new DefaultTableModel();
        
        for (String s: columns)
            model.addColumn(s);
        
        for (Purchase p: purchases) {
            model.addRow(new Object[] {
                p.getCustomerId(),
                p.getTotalAmount(),
                p.getPurchaseDate()
            });
        }
        Dashboard.setModel(model);
        table.setModel(model);
    }
    
}