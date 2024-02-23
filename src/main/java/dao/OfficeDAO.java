package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Office;
import util.DbHelper;

public class OfficeDAO implements DAO<Office> {

    @Override
    public List<Office> getAll() {
        String sql = "SELECT * FROM offices";
        List<Office> offices = new ArrayList<>();
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                offices.add(new Office(
                        resultSet.getInt("officeCode"),
                        resultSet.getString("officeAddress"),
                        resultSet.getString("officePhoneNumber")));
            }     
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return offices;
    }
    
    @Override
    public void add(Office office) {
        String sql = "INSERT INTO offices(officeAddress,officePhoneNumber) VALUES (?, ?)";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            statement.setString(1, office.getOfficeAddress());
            statement.setString(2, office.getOfficePhoneNumber());
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void update(Office office) {
        String sql = "UPDATE offices SET officeAddress = ?, officePhoneNumber = ? WHERE officeCode = ?";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareCall(sql)) {
            statement.setString(1, office.getOfficeAddress());
            statement.setString(2, office.getOfficePhoneNumber());
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM offices WHERE officeCode = ?";
        
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    
}