package service.tableconfigs;

import model.Order;
import service.TableConfig;

public class OrderTableConfig implements TableConfig<Order> {

    @Override
    public String[] getColumnNames() {
        return new String[]{
            "Order Id", "Date", "Estimated Date", "Shipped Date", "Status", "Customer Id"
        };
    }

    @Override
    public Object[] getRowData(Order o) {
        return new Object[]{
            o.getOrderId(), o.getOrderDate(), o.getEstimatedDate(), o.getShippedDate(), o.getStatus(), o.getCustomerId()
        };
    }
    
}