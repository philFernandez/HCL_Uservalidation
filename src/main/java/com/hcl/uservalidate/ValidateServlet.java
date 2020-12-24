package com.hcl.uservalidate;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.model.LoginModel;
import com.service.UserService;

/**
 * Servlet for handling login post request. This servlet is configured in web.xml file
 */
public class ValidateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            UserService loginService = new UserService();
            HttpSession session;
            LoginModel loginModel = new LoginModel(request.getParameter("uname"),
                    request.getParameter("pass"));
            boolean isLoggedIn = loginService.login(loginModel);
            if (isLoggedIn) {
                session = request.getSession();
                // save logged in users' session
                session.setAttribute("username", loginModel.getUsername());
                // redirect to logged_in dashboard page
                response.sendRedirect("logged_in.jsp");
            } else {
                // if login failed invalidate any session
                session = request.getSession(false);
                session.invalidate();
                // redirecto to error page
                response.sendRedirect("bad_login.jsp");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
