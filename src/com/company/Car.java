package com.company;

public class Car extends Vehicle {

    private String make;
    private String model;
    private  int speed;

    public Car() {
    }

    public Car(String color, String name, String make) {
        super(color, name);
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public String starting(){
        return "The " + getColor() + " " + getMake() + " is starting.";
    }

    public String accelerate(){
        return "The " + getColor() + " " + getMake() + " is accelerating.";
    }

    public String speed(){
        return "The " + getColor() + " " + getMake() + " is going " + speed + " mph.";
    }

    public String stop(){
        return "The " + getColor() + " " + getMake() + " is stopped.";
    }
}
