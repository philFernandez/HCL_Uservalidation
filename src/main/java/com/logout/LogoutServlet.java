package com.logout;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Logout", description = "Logout Servlet", urlPatterns = {"/Logout"})
public class LogoutServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            HttpSession session = request.getSession(false);
            // Invalidate the logged in users' session
            session.invalidate();
            // and redirect to the logout page
            response.sendRedirect("logged_out.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
