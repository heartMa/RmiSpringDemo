package com.w3cjava.rmi.server;


import com.w3cjava.rmi.bean.User;

public class UserHandlerImpl implements UserHandler {
    public UserHandlerImpl(){
        super();
    }

    public String getUserName(int id){
        return "cos";
    }
    public int getUserCount(){
        return 1;
    }
    public User getUserByName(String name){
        return new User(1,"cos");
    }
}
