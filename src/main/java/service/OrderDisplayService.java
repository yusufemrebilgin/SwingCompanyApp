package service;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Order;
import view.Dashboard;

public class OrderDisplayService implements DisplayService<Order> {

    @Override
    public void displayData(List<Order> orders, JTable table) {
        String[] columns = {
            "Order Id","Date","Estimated Date","Shipped Date","Status","Customer Id"
        };
        DefaultTableModel model = new DefaultTableModel();
        
        for (String s: columns)
            model.addColumn(s);
        
        for (Order o: orders) {
            model.addRow(new Object[] {
                o.getOrderId(),
                o.getOrderDate(),
                o.getEstimatedDate(),
                o.getShippedDate(),
                o.getStatus(),
                o.getCustomerId()
            });
        }
        Dashboard.setModel(model);
        table.setModel(model);
    }
   
}