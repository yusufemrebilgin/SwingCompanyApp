package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Customer;
import util.DbHelper;
import util.ResultSetMapper;

public class CustomerDAO implements DAO<Customer> {

    @Override
    public List<Customer> getAll() {
        String sql = "SELECT * FROM customers";
        List<Customer> customers = new ArrayList<>();
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                customers.add(ResultSetMapper.mapToCustomer(resultSet));
            }     
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return customers;
    }
    
    @Override
    public void add(Customer customer) {
        String sql = "INSERT INTO customers(firstName,lastName,email,phoneNumber,address,city,country,postalCode)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            statement.setString(1, customer.getFirstName());
            statement.setString(2, customer.getLastName());
            statement.setString(3, customer.getEmail());
            statement.setString(4, customer.getPhoneNumber());
            statement.setString(5, customer.getAddress());
            statement.setString(6, customer.getCity());
            statement.setString(7, customer.getCountry());
            statement.setInt(8, customer.getPostalCode());
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void update(Customer customer) {
        String sql = "UPDATE customers SET firstName = ?, lastName = ?, email = ?, phoneNumber = ?,"
                + " address = ?, city = ?, country = ?, postalCode = ? WHERE customerId = ?";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareCall(sql)) {
            statement.setString(1, customer.getFirstName());
            statement.setString(2, customer.getLastName());
            statement.setString(3, customer.getEmail());
            statement.setString(4, customer.getPhoneNumber());
            statement.setString(5, customer.getAddress());
            statement.setString(6, customer.getCity());
            statement.setString(7, customer.getCountry());
            statement.setInt(8, customer.getPostalCode());
            statement.setInt(9, customer.getCustomerId());
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM customers WHERE customerID = ?";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    
}