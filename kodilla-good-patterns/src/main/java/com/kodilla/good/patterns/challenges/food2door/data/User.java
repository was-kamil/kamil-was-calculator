package com.kodilla.good.patterns.challenges.food2door.data;

public class User {
    private String name;
    private String surname;
    private String phone;
    private String city;

    public User(String name, String surname, String phone, String city) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }
}
