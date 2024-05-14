<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.user.Registration" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List of Registrations</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>List of Registered Users</h1>
         <div class="menu">
            <a href="registration.jsp">Add New Registration</a>
        </div>
        <br>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Date of Birth</th>
                <th>Actions</th>
            </tr>
            <% 
                List<Registration> registrations = (List<Registration>) request.getAttribute("registrations");
                if (registrations != null && !registrations.isEmpty()) {
                    for (Registration registration : registrations) {
            %>
            <tr>
                <td><%= registration.getId() %></td>
                <td><%= registration.getName() %></td>
                <td><%= registration.getEmail() %></td>
                <td><%= registration.getDateOfBirth() %></td>
                <td>
                    <a href="update.jsp?id=<%= registration.getId() %>">Update</a>
                    <a href="delete?id=<%= registration.getId() %>">Delete</a>
                </td>
            </tr>
            <% 
                    }
                } else {
            %>
            <tr>
                <td colspan="5">No registrations found.</td>
            </tr>
            <% } %>
        </table>
    </div>
</body>
</html>
