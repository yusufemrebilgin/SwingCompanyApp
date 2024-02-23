package service;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import view.Dashboard;

public class CustomerDisplayService implements DisplayService<Customer> {

    @Override
    public void displayData(List<Customer> customers, JTable table) {
        String[] columns = {
            "ID","First Name","Last Name","Email","Phone","Address","City","Country","Postal Code"
        };
        DefaultTableModel model = new DefaultTableModel();
        
        for (String s: columns)
            model.addColumn(s);
        
        for (Customer c: customers) {
            model.addRow(new Object[] {
                c.getCustomerId(),
                c.getFirstName(),
                c.getLastName(),
                c.getEmail(),
                c.getPhoneNumber(),
                c.getAddress(),
                c.getCity(),
                c.getCountry(),
                c.getPostalCode()
            });
        }
        Dashboard.setModel(model);
        table.setModel(model);
    }
    
}