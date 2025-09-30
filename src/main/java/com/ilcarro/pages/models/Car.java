package com.ilcarro.pages.models;

public class Car {
    private String city;
    private String make;
    private String model;
    private String year;
    private String seats;
    private String fuel;
    private String gear;
    private String wd;
    private String carClass;
    private String carRegistrationNumber;
    private String price;

    public String getCarClass() {
        return carClass;
    }

    public Car setCarClass(String carClass) {
        this.carClass = carClass;

        return this;
    }

    public String getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public Car setCarRegistrationNumber(String carRegistrationNumber) {
        this.carRegistrationNumber = carRegistrationNumber;

        return this;
    }

    public String getPrice() {
        return price;
    }

    public Car setPrice(String price) {
        this.price = price;

        return this;
    }

    public String getCity() {
        return city;
    }

    public Car setCity(String city) {
        this.city = city;
        return this;
    }

    public String getMake() {
        return make;
    }

    public Car setMake(String make) {
        this.make = make;

        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;

        return this;
    }

    public String getYear() {
        return year;
    }

    public Car setYear(String year) {
        this.year = year;

        return this;
    }

    public String getSeats() {
        return seats;
    }

    public Car setSeats(String seats) {
        this.seats = seats;

        return this;
    }

    public String getFuel() {
        return fuel;
    }

    public Car setFuel(String fuel) {
        this.fuel = fuel;

        return this;
    }

    public String getGear() {
        return gear;
    }

    public Car setGear(String gear) {
        this.gear = gear;

        return this;
    }

    public String getWd() {
        return wd;
    }

    public Car setWd(String wd) {
        this.wd = wd;

        return this;
    }
}
