package com.example.midterm.Model;

public class Users {
    private String Mail,Pass,Username;

    public Users() {
    }

    public Users(String mail, String pass, String username) {
        Mail = mail;
        Pass = pass;
        Username = username;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
}
