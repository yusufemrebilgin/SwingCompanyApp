package service;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import view.Dashboard;

public class EmployeeDisplayService implements DisplayService<Employee> {

    @Override
    public void displayData(List<Employee> employees, JTable table) {
        String[] columns = {
            "ID","First Name","Last Name","Email","Phone","Job Title","Start Date","Office Code"
        };
        DefaultTableModel model = new DefaultTableModel();
        
        for (String s: columns)
            model.addColumn(s);
        
        for (Employee e: employees) {
            model.addRow(new Object[] {
                e.getEmployeeId(),
                e.getFirstName(),
                e.getLastName(),
                e.getEmail(),
                e.getPhoneNumber(),
                e.getJobTitle(),
                e.getStartDate(),
                e.getOfficeCode()
            });
        }
        Dashboard.setModel(model);
        table.setModel(model);
    } 
    
}