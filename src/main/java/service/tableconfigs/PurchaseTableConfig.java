package service.tableconfigs;

import model.Purchase;
import service.TableConfig;

public class PurchaseTableConfig implements TableConfig<Purchase> {

    @Override
    public String[] getColumnNames() {
        return new String[]{
            "Customer Id", "Total Amount", "Purchase Date"
        };
    }

    @Override
    public Object[] getRowData(Purchase p) {
        return new Object[]{
            p.getCustomerId(), p.getTotalAmount(), p.getPurchaseDate()
        };
    }
    
}