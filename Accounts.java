import java.sql.*;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;

public class Accounts {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/userauthenticatioin";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "iamAakash@100";

    // Hash password using SHA-256
    private static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashedBytes = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashedBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    // Insert user into the database (called from GUI)
    public static boolean createUser(String username, String password) {
		                  // Inside the createUser() method:
              try {
    // Explicitly load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
    // Rest of your database connection code...
            } catch (ClassNotFoundException e) {
           System.err.println("MySQL JDBC Driver not found!");
           e.printStackTrace();
           return false;
              }
        try {
            String hashedPassword = hashPassword(password);
            String checkUserSQL = "SELECT username FROM users WHERE username = ?";
            String insertUserSQL = "INSERT INTO users (username, password_hash) VALUES (?, ?)";

            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
				
                // Check if username exists
                try (PreparedStatement checkStmt = conn.prepareStatement(checkUserSQL)) {
                    checkStmt.setString(1, username);
                    ResultSet rs = checkStmt.executeQuery();
                    if (rs.next()) {
                        return false; // Username already exists
                    }
                }

                // Insert new user
                try (PreparedStatement insertStmt = conn.prepareStatement(insertUserSQL)) {
                    insertStmt.setString(1, username);
                    insertStmt.setString(2, hashedPassword);
                    insertStmt.executeUpdate();
                    return true;
                }
            }
        } catch (NoSuchAlgorithmException | SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
	
    // ... existing code ...

    // Validate user credentials
    public static boolean validateUser(String username, String password) {
        String sql = "SELECT password_hash FROM users WHERE username = ?";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                String storedHash = rs.getString("password_hash");
                String inputHash = hashPassword(password); // Hash the input password
                return inputHash.equals(storedHash);
            }
            return false; // Username not found
            
        } catch (SQLException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        }
    }

	public static void main(String[] args){
		Accounts accc = new Accounts();
	}
}