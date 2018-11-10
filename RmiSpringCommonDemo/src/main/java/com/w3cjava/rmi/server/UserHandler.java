package com.w3cjava.rmi.server;

import com.w3cjava.rmi.bean.User;

public interface UserHandler{
    String getUserName(int id);
    int getUserCount();
    User getUserByName(String name);
}
