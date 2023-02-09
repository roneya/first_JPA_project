package com.example.sql;

import jakarta.persistence.*;

@Entity
@Table(name = "user_info")


public class User {


    @Id
    @Column(unique = true)
    private int id;

    @Column(unique = true)
    private String email;
    private String name;

    private int age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //@Column(name="HomeState")
    private String state;

    public User() { //default constructor for beans
    }

    public User(int id, String email, String name, int age, String state) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.age = age;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}










