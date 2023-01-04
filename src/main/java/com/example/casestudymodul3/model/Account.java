package com.example.casestudymodul3.model;

public class Account {
    private int idAccounts;
    private String username;
    private String password;
    private  String email;
    private  String phone;
    private String address;
    private  int idroles;
    private  int  idstatus;
    private  String avatarurl;


    public Account(int idAccounts, String username, String password, String email, String phone, int status, String address, String avatarurl) {
        this.idAccounts = idAccounts;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.idstatus = status;
        this.avatarurl = avatarurl;
    }

    public Account(int idAccounts, String username, String password, String email, String phone, String address, int idroles, int idstatus, String avatarurl) {
        this.idAccounts = idAccounts;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.idroles = idroles;
        this.idstatus = idstatus;
        this.avatarurl = avatarurl;
    }

    public Account(int idAccounts, String username, String password, String email, String phone, String address, int idstatus, String avatarurl) {
        this.idAccounts = idAccounts;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.idstatus = idstatus;
        this.avatarurl = avatarurl;
    }

    public Account(int idAccounts, String username) {
        this.idAccounts = idAccounts;
        this.username = username;
    }


    public Account(String username, String password, String email, String phone, String address, String avatarurl, int  idstatus) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.avatarurl = avatarurl;
        this.idstatus= idstatus ;
    }

    public Account(int idAccounts, String username,String avatarurl) {
        this.idAccounts = idAccounts;
        this.username = username;
        this.avatarurl = avatarurl;
    }
    public Account(int idAccounts, String username,String avatarurl, int idroles) {
        this.idAccounts = idAccounts;
        this.username = username;
        this.avatarurl = avatarurl;
        this.idroles=  idroles;
    }

    public Account() {
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

    public int getIdAccounts() {
        return idAccounts;
    }

    public void setIdAccounts(int idAccounts) {
        this.idAccounts = idAccounts;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
