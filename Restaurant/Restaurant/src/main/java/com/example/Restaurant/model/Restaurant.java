package com.example.Restaurant.model;

public class Restaurant {
    private int id;
    private String name;
    private String Address;
    private long number;

    private String speciality;

    Restaurant(){}

    public Restaurant(int id, String name, String address, long number, String speciality) {
        this.id = id;
        this.name = name;
        Address = address;
        this.number = number;
        this.speciality = speciality;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", number=" + number +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
