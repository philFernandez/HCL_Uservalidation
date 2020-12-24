package com.service;

import com.dao.Dao;
import com.model.LoginModel;

public class UserService implements Dao {
    private static final String USER = "John";
    private static final String PASS = "1234";

    @Override
    public boolean login(LoginModel loginModel) {
        return loginModel.getPassword().equals(PASS)
                && loginModel.getUsername().equals(USER);
    }
}
