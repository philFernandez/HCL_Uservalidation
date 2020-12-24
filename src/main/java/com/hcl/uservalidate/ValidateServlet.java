package com.hcl.uservalidate;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.model.LoginModel;
import com.service.UserService;

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
                session.setAttribute("username", loginModel.getUsername());
                response.sendRedirect("logged_in.jsp");
            } else {
                session = request.getSession(false);
                session.invalidate();
                response.sendRedirect("bad_login.jsp");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
