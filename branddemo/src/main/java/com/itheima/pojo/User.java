package com.itheima.pojo;

public class User {
    String username;
    String password;
    int id;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String uername) {
        this.username = uername;
    }

    public void setPassword(String psaaword) {
        this.password = psaaword;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "user{" +
                "uername='" + username + '\'' +
                ", psaaword='" + password + '\'' +
                ", id=" + id +
                '}';
    }

}
