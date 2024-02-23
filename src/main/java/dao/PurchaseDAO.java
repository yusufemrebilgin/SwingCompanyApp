package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Purchase;
import util.DbHelper;

public class PurchaseDAO implements DAO<Purchase> {

    @Override
    public List<Purchase> getAll() {
        String sql = "SELECT * FROM purchase";
        List<Purchase> purchases = new ArrayList<>();
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                purchases.add(new Purchase(
                        resultSet.getInt("customerId"),
                        resultSet.getFloat("totalAmount"),
                        resultSet.getDate("purchaseDate")));
            }     
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return purchases;
    }

    @Override
    public void add(Purchase purchase) {
        String sql = "INSERT INTO purchase(customerId,totalAmount,purchaseDate) VALUES (?, ?, ?)";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            statement.setInt(1, purchase.getCustomerId());
            statement.setFloat(2, purchase.getTotalAmount());
            statement.setDate(3, purchase.getPurchaseDate());
            
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void update(Purchase purchase) {
        String sql = "UPDATE purchase SET totalAmount = ?, purchaseDate = ? WHERE customerId = ?";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareCall(sql)) {
            statement.setFloat(1, purchase.getTotalAmount());
            statement.setDate(2, purchase.getPurchaseDate());
            statement.setInt(3, purchase.getCustomerId());
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM purchase WHERE customerId = ?";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    
}