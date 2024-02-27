package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import util.DbHelper;
import util.ResultSetMapper;

public class ProductDAO implements DAO<Product> {

    @Override
    public List<Product> getAll() {
        String sql = "SELECT * FROM products";
        List<Product> products = new ArrayList<>();
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                products.add(ResultSetMapper.mapToProduct(resultSet));
            }     
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return products;
    }

    @Override
    public void add(Product product) {
        String sql = "INSERT INTO products(productName,manufacturer,quantityInStock,buyPrice)"
                + " VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            statement.setString(1, product.getProductName());
            statement.setString(2, product.getManufacturer());
            statement.setInt(3, product.getQuantityInStock());
            statement.setFloat(4, product.getBuyPrice());
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void update(Product product) {
        String sql = "UPDATE products SET productName = ?, manufacturer = ?, quantityInStock = ?, buyPrice = ?"
                + " WHERE productCode = ?";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareCall(sql)) {
            statement.setString(1, product.getProductName());
            statement.setString(2, product.getManufacturer());
            statement.setInt(3, product.getQuantityInStock());
            statement.setFloat(4, product.getBuyPrice());
            statement.setInt(5, product.getProductCode());
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM products WHERE productCode = ?";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    
}