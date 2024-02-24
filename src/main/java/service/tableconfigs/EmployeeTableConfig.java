package service.tableconfigs;

import model.Employee;
import service.TableConfig;

public class EmployeeTableConfig implements TableConfig<Employee> {

    @Override
    public String[] getColumnNames() {
        return new String[]{
            "ID", "First Name", "Last Name", "Email", "Phone", "Job Title", "Start Date", "Office Code"
        };
    }

    @Override
    public Object[] getRowData(Employee e) {
        return new Object[]{
            e.getEmployeeId(), e.getFirstName(), e.getLastName(), e.getEmail(), e.getPhoneNumber(),
            e.getJobTitle(), e.getStartDate(), e.getOfficeCode()
        };
    }
    
}