package com.company;

public class SomeObject {
    private String name;
    private String surname;
    private String city;
    public SomeObject(String name, String surname, String city){
        this.name = name;
        this.surname = surname;
        this.city = city;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }
}
