package service.tableconfigs;

import model.Product;
import service.TableConfig;

public class ProductTableConfig implements TableConfig<Product> {

    @Override
    public String[] getColumnNames() {
        return new String[]{
            "Product Code", "Product Name", "Manufacturer", "Quantity", "Price"
        };
    }

    @Override
    public Object[] getRowData(Product p) {
        return new Object[]{
            p.getProductCode(), p.getProductName(), p.getManufacturer(), p.getQuantityInStock(), p.getBuyPrice()
        };
    }
    
}