package service.tableconfigs;

import model.Customer;
import service.TableConfig;

public class CustomerTableConfig implements TableConfig<Customer> {

    @Override
    public String[] getColumnNames() {
        return new String[]{
            "ID", "First Name", "Last Name", "Email", "Phone", "Address", "City", "Country", "Postal Code"
        };
    }

    @Override
    public Object[] getRowData(Customer c) {
        return new Object[]{
            c.getCustomerId(), c.getFirstName(), c.getLastName(), c.getEmail(), c.getPhoneNumber(), c.getAddress(),
            c.getCity(), c.getCountry(), c.getPostalCode()
        };
    }
    
}