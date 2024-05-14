package com.user;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RegistrationDAO {
    private Connection connection;

    public RegistrationDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?user=root&password=root");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void addRegistration(Registration registration) {
        String query = "INSERT INTO Registration (Name, Email, DateOfBirth) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            if (registration.getName() == null || registration.getEmail() == null || registration.getDateOfBirth() == null) {
                return;
            }
            preparedStatement.setString(1, registration.getName());
            preparedStatement.setString(2, registration.getEmail());
            preparedStatement.setString(3, registration.getDateOfBirth());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Registration> getAllRegistrations() {
        List<Registration> registrations = new ArrayList<>();
        String query = "SELECT * FROM Registration";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Registration registration = new Registration();
                registration.setId(resultSet.getInt("ID"));
                registration.setName(resultSet.getString("Name"));
                registration.setEmail(resultSet.getString("Email"));
                registration.setDateOfBirth(resultSet.getString("DateOfBirth"));
                registrations.add(registration);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrations;
    }

    public void updateRegistration(Registration registration) {
        String query = "UPDATE Registration SET Name=?, Email=?, DateOfBirth=? WHERE ID=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            if (registration.getName() == null || registration.getEmail() == null || registration.getDateOfBirth() == null) {
                return;
            }

            preparedStatement.setString(1, registration.getName());
            preparedStatement.setString(2, registration.getEmail());
            preparedStatement.setString(3, registration.getDateOfBirth());
            preparedStatement.setInt(4, registration.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteRegistration(int id) {
        String query = "DELETE FROM Registration WHERE ID=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
