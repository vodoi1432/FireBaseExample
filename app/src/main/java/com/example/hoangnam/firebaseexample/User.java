package com.example.hoangnam.firebaseexample;

/**
 * Created by Hoang Nam on 7/13/2016.
 */
public class User {
    private int id;
    private String name;
    public User() {

    }
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public User(int id) {
        this.id = id;
        this.name = "name"+id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
