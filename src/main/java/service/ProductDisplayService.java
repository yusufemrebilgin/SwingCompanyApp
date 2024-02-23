package service;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Product;
import view.Dashboard;

public class ProductDisplayService implements DisplayService<Product> {

    @Override
    public void displayData(List<Product> products, JTable table) {
        String[] columns = {
            "Product Code","Product Name","Manufacturer","Quantity","Price"
        };
        DefaultTableModel model = new DefaultTableModel();
        
        for (String s: columns)
            model.addColumn(s);
        
        for (Product p: products) {
            model.addRow(new Object[] {
                p.getProductCode(),
                p.getProductName(),
                p.getManufacturer(),
                p.getQuantityInStock(),
                p.getBuyPrice()
            });
        }
        Dashboard.setModel(model);
        table.setModel(model);
    }
    
}