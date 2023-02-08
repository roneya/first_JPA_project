package com.example.sql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_info")
@IdClass(UserId.class)

public class User {


    @Id
    private int id;
    @Id
    private String name;
    @Id
    private int age;

    private String state;

    public User() { //default constructor for beans
    }

    public User (int id, String name, int age, String state) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.state=state;
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










