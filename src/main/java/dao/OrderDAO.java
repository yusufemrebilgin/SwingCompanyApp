package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Order;
import util.DbHelper;

public class OrderDAO implements DAO<Order> {

    @Override
    public List<Order> getAll() {
        String sql = "SELECT * FROM orders";
        List<Order> orders = new ArrayList<>();
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                orders.add(new Order(
                        resultSet.getInt("orderId"),
                        resultSet.getDate("orderDate"),
                        resultSet.getDate("estimatedDate"),
                        resultSet.getDate("shippedDate"),
                        resultSet.getString("status"),
                        resultSet.getInt("customerId")));
            }     
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return orders;
    }
    
    @Override
    public void add(Order order) {
        String sql = "INSERT INTO orders(orderDate,estimatedDate,shippedDate,status,customerId)"
                + " VALUES (?, ?, ?, ?, ?)";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            statement.setDate(1, order.getOrderDate());
            statement.setDate(2, order.getEstimatedDate());
            statement.setDate(3, order.getShippedDate());
            statement.setString(4, order.getStatus());
            statement.setInt(5, order.getCustomerId());
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void update(Order order) {
        String sql = "UPDATE orders SET orderDate = ?, estimatedDate = ?, shippedDate = ?,"
                + " status = ?, customerId = ? WHERE orderId = ?";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareCall(sql)) {
            statement.setDate(1, order.getOrderDate());
            statement.setDate(2, order.getEstimatedDate());
            statement.setDate(3, order.getShippedDate());
            statement.setString(4, order.getStatus());
            statement.setInt(5, order.getCustomerId());
            statement.setInt(6, order.getOrderId()); 
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM orders WHERE orderId = ?";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
        
}