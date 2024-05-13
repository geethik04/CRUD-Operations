<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Registration</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Update User Details</h1>
        <form action="update" method="post">
            <input type="hidden" name="id" value="<%= request.getParameter("id") %>">
            <input type="text" name="name" placeholder="Name" required<%= request.getParameter("name") %>"><br>
            <input type="email" name="email" placeholder="Email" required<%= request.getParameter("email") %>"><br>
            <input type="date" name="dateOfBirth" required value="<%= request.getParameter("dateOfBirth") %>"><br>
            <button type="submit">Update User</button>
        </form>
    </div>
</body>
</html>

