package com.service;

import com.dao.Dao;
import com.model.LoginModel;

public class UserService implements Dao {
    // Provided two hardcoded users to demostrate dynamic dashboard functionality
    private static final String USER1 = "John";
    private static final String PASS1 = "1234";
    private static final String USER2 = "Joe";
    private static final String PASS2 = "4321";

    @Override
    public boolean login(LoginModel loginModel) {
        // return true if user name is "John" AND password is "1234" OR
        // return true if user name is "Joe" AND password is "4321"
        return (loginModel.getPassword().equals(PASS1)
                && loginModel.getUsername().equals(USER1))
                || (loginModel.getPassword().equals(PASS2)
                        && loginModel.getUsername().equals(USER2));
    }

}
