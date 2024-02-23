package service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.DbHelper;

public class LoginService {
    public static boolean authenticate(String username, String password) {
        try {
            String[] adminInformations = getAdminInformationFromDb();
            String storedUsername = adminInformations[0];
            String storedPassword = adminInformations[1];
            
            if (username.equals(storedUsername) && hash(password).equals(storedPassword)) {
                return true;
            }
        } catch (SQLException exception) {
            // hata metodu yazılabilir
            exception.printStackTrace();
        }
        return false;
    }
    
    private static String[] getAdminInformationFromDb() throws SQLException {
        String[] adminInformations = new String[2];
        String sql = "SELECT * FROM admins";
        try (PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    adminInformations[0] = resultSet.getString("username");    
                    adminInformations[1] = resultSet.getString("password");                   
                }
            }
        } 
        return adminInformations;
    }
    
    private static String hash(String password) {
        try {
            byte[] passwordBytes = password.getBytes(StandardCharsets.UTF_8);
            byte[] hashedBytes = MessageDigest.getInstance("SHA-256").digest(passwordBytes);
            
            StringBuilder hexString = new StringBuilder();
            for (byte b: hashedBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException exception) {
            return hashWithDefaultAlgorithm(password);
        }
    }
    
    private static String hashWithDefaultAlgorithm(String input) {
        try {
            byte[] passwordBytes = input.getBytes(StandardCharsets.UTF_8);
            byte[] hashedBytes = MessageDigest.getInstance("MD5").digest(passwordBytes);
            
            StringBuilder hexString = new StringBuilder();
            for (byte b: hashedBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException exception) {
            exception.printStackTrace();
            return null;
        }
    }
    
}