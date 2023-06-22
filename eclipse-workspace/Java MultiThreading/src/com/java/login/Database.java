package com.java.login;

import java.sql.*;

public class Database {
    private Connection connection;
    
    public Database() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "SQL");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public User getUser(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int userId = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                return new User(userId, name, email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void updateUser(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE users SET email = ? WHERE id = ?");
            statement.setString(1, user.getEmail());
            statement.setInt(2, user.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

