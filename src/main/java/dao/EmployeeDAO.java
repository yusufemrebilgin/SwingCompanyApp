package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Employee;
import util.DbHelper;

public class EmployeeDAO implements DAO<Employee> {

    @Override
    public List<Employee> getAll() {
        String sql = "SELECT * FROM employees";
        List<Employee> employees = new ArrayList<>();
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                employees.add(new Employee(
                        resultSet.getInt("employeeId"),
                        resultSet.getString("firstName"),
                        resultSet.getString("lastName"),
                        resultSet.getString("email"),
                        resultSet.getString("phoneNumber"),
                        resultSet.getString("jobTitle"),
                        resultSet.getDate("startDate"),
                        resultSet.getInt("officeCode")));
            }     
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return employees;
    }

    @Override
    public void add(Employee employee) {
        String sql = "INSERT INTO employees(firstName,lastName,email,phoneNumber,jobTitle,startDate,officeCode)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            statement.setString(1, employee.getFirstName());
            statement.setString(2, employee.getLastName());
            statement.setString(3, employee.getEmail());
            statement.setString(4, employee.getPhoneNumber());
            statement.setString(5, employee.getJobTitle());
            statement.setDate(6, employee.getStartDate());
            statement.setInt(7, employee.getOfficeCode());
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void update(Employee employee) {
        String sql = "UPDATE employees SET firstName = ?, lastName = ?, email = ?, phoneNumber = ?,"
                + " jobTitle = ?, startDate = ?, officeCode = ? WHERE employeeId = ?";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareCall(sql)) {
            statement.setString(1, employee.getFirstName());
            statement.setString(2, employee.getLastName());
            statement.setString(3, employee.getEmail());
            statement.setString(4, employee.getPhoneNumber());
            statement.setString(5, employee.getJobTitle());
            statement.setDate(6, employee.getStartDate());
            statement.setInt(7, employee.getOfficeCode());
            statement.setInt(8, employee.getEmployeeId());
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM employees WHERE employeeId = ?";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }   
    
}