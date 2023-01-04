package com.example.casestudymodul3.model;

public class Account {
    private int idaccount;
    private String username;
    private String password;
    private String email;
    private String phonenumber;
    private String address;

    private int idroles;
    private int idstatus;
    private String avatarurl;

    public Account(int idaccount, String username, int idstatus, String avatarurl) {
        this.idaccount = idaccount;
        this.username = username;
        this.idstatus = idstatus;
        this.avatarurl = avatarurl;
    }

    public Account(String username, String password, String email, String phonenumber, String address, int idroles, int idstatus, String avatarurl) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phonenumber = phonenumber;
        this.address = address;
        this.idroles = idroles;
        this.idstatus = idstatus;
        this.avatarurl = avatarurl;
    }

    public Account(int idaccount, String username, String password, String email, String phonenumber, String address, int idroles, int idstatus, String avatarurl) {
        this.idaccount = idaccount;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phonenumber = phonenumber;
        this.address = address;
        this.idroles = idroles;
        this.idstatus = idstatus;
        this.avatarurl = avatarurl;
    }

    public Account(String username, String password, String email, String phonenumber, String address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phonenumber = phonenumber;
        this.address = address;
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(String password) {
        this.password = password;
    }

    public Account() {
    }

    public Account(int idAccounts, String username, String avatar) {
        this.idaccount = idAccounts;
        this.username = username;
        this.avatarurl = avatar;
    }

    public int getIdaccount() {
        return idaccount;
    }

    public void setIdaccount(int idaccount) {
        this.idaccount = idaccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdroles() {
        return idroles;
    }

    public void setIdroles(int idroles) {
        this.idroles = idroles;
    }

    public int getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(int idstatus) {
        this.idstatus = idstatus;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }
}

