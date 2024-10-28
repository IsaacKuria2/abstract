package com.example.account;

public class Admin extends Account {
    // A private string specific only to the Admin
    private String authPassword;

    public Admin(int _id, String _name, String _password) {
        id = _id;
        name = _name;
        authPassword = _password;
    }
}
