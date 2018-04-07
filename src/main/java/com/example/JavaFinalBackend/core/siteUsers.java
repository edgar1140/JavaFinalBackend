package com.example.JavaFinalBackend.core;

public class Subscriber {
    public Integer id;
    public String name;
    public String sessionKey;
    public String password;
    public String email;

    public Subscriber(int id, String name, String password, String sessionKey) {
    }

    public Subscriber(Integer id, String name, String sessionKey, String username, String password, String email) {
        this.id = id;
        this.name = name;
        this.sessionKey = sessionKey;
        this.password = password;
        this.email = email;

    }
}
