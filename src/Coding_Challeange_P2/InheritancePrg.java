package Coding_Challeange_P2;

public class InheritancePrg {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bike()};

        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine starts with a roar!");
    }
}
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike engine starts with a purr!");
    }
}