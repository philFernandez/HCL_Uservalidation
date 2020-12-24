package com.service;

import com.dao.Dao;
import com.model.LoginModel;

public class UserService implements Dao {
    private static final String USER = "John123";
    private static final String PASS = "123abc";

    @Override
    public boolean login(LoginModel loginModel) {
        if (loginModel.getPassword().equals(PASS)
                && loginModel.getUsername().equals(USER)) {
            return true;
        }
        return false;
    }

}
