package com.user;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/add")
public class RegistrationServlet extends HttpServlet {

    private RegistrationDAO registrationDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        registrationDAO = new RegistrationDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String dob = request.getParameter("dateOfBirth");
        Registration registration = new Registration();
        registration.setName(name);
        registration.setEmail(email);
        registration.setDateOfBirth(dob);
        registrationDAO.addRegistration(registration);
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", "Successfully Registered!");
        response.sendRedirect("registration.jsp");
    }
}
