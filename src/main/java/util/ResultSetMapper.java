package util;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.*;

public class ResultSetMapper {

    public static Customer mapToCustomer(ResultSet resultSet) throws SQLException {
        return new Customer(
                resultSet.getInt("customerId"),
                resultSet.getString("firstName"),
                resultSet.getString("lastName"),
                resultSet.getString("email"),
                resultSet.getString("phoneNumber"),
                resultSet.getString("address"),
                resultSet.getString("city"),
                resultSet.getString("country"),
                resultSet.getInt("postalCode"));
    }
    
    public static Employee mapToEmployee(ResultSet resultSet) throws SQLException {
        return new Employee(
                resultSet.getInt("employeeId"),
                resultSet.getString("firstName"),
                resultSet.getString("lastName"),
                resultSet.getString("email"),
                resultSet.getString("phoneNumber"),
                resultSet.getString("jobTitle"),
                resultSet.getDate("startDate"),
                resultSet.getInt("officeCode"));
    }
    
    public static Office mapToOffice(ResultSet resultSet) throws SQLException {
        return new Office(
                resultSet.getInt("officeCode"),
                resultSet.getString("officeAddress"),
                resultSet.getString("officePhoneNumber"));
    }
    
    public static Order mapToOrder(ResultSet resultSet) throws SQLException {
        return new Order(
                resultSet.getInt("orderId"),
                resultSet.getDate("orderDate"),
                resultSet.getDate("estimatedDate"),
                resultSet.getDate("shippedDate"),
                resultSet.getString("status"),
                resultSet.getInt("customerId"));
    }
    
    public static Product mapToProduct(ResultSet resultSet) throws SQLException {
        return new Product(
                resultSet.getInt("productCode"),
                resultSet.getString("productName"),
                resultSet.getString("manufacturer"),
                resultSet.getInt("quantityInStock"),
                resultSet.getFloat("buyPrice"));
    }
    
    public static Purchase mapToPurchase(ResultSet resultSet) throws SQLException {
        return new Purchase(
                resultSet.getInt("customerId"),
                resultSet.getFloat("totalAmount"),
                resultSet.getDate("purchaseDate"));
    }
    
}