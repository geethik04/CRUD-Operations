<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration</title>
    <link rel="stylesheet" href="styles.css">
    <script src="scripts.js"></script>
</head>
<body>
    <div class="container">
        <h1>User Registration</h1>
  
        <h2>Add New User</h2>
        <form action="add" method="post">
            <input type="text" name="name" placeholder="Name" required><br>
            <input type="email" name="email" placeholder="Email" required><br>
            <input type="date" name="dateOfBirth" required><br>
            <button type="submit">Add User</button>
        </form>
   
        <div class="menu">
            <a href="list">List of Users</a>
        </div>
        <% String successMessage = (String) session.getAttribute("successMessage");
        if (successMessage != null && !successMessage.isEmpty()) { %>
            <div class="success-message">
                <%= successMessage %>
            </div>
            <% session.removeAttribute("successMessage"); %>
        <% } %>
    </div>
</body>
</html>
