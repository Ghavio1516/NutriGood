package com.data.response;

public class User {
    private String email;
    private String password;
    private String name;
    private int age;
    private String diabetes;
    private int bb; // Ubah tipe data ke int

    // Constructor
    public User(String email, String password, String name, int age, String diabetes, int bb) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.age = age;
        this.diabetes = diabetes;
        this.bb = bb; //
    }

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public int getBb() {
        return bb;
    }

    public void setBb(int bb) {
        this.bb = bb;
    }
}
