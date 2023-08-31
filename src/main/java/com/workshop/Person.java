package com.workshop;

public class Person {
    private int id;
    private String firstname;
    private String lastname;
    private String email;

    public Person() {

    }

    public Person(String name, String sureName) {

        setFirstname(name);
        setLastname(sureName);

    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return "id:" + getId() + "," + "name:" + getFirstname() + " " + getLastname() + "," + "email:" + getEmail();
    }
}
