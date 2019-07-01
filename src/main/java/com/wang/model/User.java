package com.wang.model;

public class User {
    private long id;
    private String nickname;
    private String mobile;
    private String password;
    private String role;

    public User(long id, String nickname, String mobile, String password, String role) {
        this.id = id;
        this.nickname = nickname;
        this.mobile = mobile;
        this.password = password;
        this.role = role;
    }

    public User() {
        super();
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

}
