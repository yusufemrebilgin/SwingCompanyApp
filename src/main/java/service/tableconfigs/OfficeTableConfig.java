package service.tableconfigs;

import model.Office;
import service.TableConfig;

public class OfficeTableConfig implements TableConfig<Office> {

    @Override
    public String[] getColumnNames() {
        return new String[]{
            "Office Code", "Address", "Phone Number"
        };
    }

    @Override
    public Object[] getRowData(Office o) {
        return new Object[]{
            o.getOfficeCode(), o.getOfficeAddress(), o.getOfficePhoneNumber()
        };
    }
    
}