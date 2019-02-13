package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car = new Car();
        car.setMake("Porsche");
        car.setColor("red");
        car.setSpeed(50);

        print(car.starting());
        print(car.accelerate());
        print(car.speed());
        print(car.stop());
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
