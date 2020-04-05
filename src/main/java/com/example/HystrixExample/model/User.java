package com.example.HystrixExample.model;

public class User {
    private int userId;
    private String userName;
    private String companyname;

    public User(int userId, String userName, String companyname) {
        this.userId = userId;
        this.userName = userName;
        this.companyname = companyname;
    }

    public User() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", companyname='" + companyname + '\'' +
                '}';
    }
}
