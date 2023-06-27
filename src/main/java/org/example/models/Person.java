package org.example.models;

public class Person {
    private int id;
    private String name;
    private String surName;
    private String mail;

    public Person() {

    }

    public Person(int id, String name, String surName, String mail) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.mail = mail;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
